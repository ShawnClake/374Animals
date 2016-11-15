package com.SSUJ.world;

import com.SSUJ.animal.Animal;
import com.SSUJ.animal.EatType;
import com.SSUJ.tile.Tile;
import com.SSUJ.vegetation.Vegetation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*******************************************************************************
 * World
 * 
 * Purpose: This is the world that the animals roam in.
 * 
 *********************************************************************************/

public class World {

	private int x; // Size of map in x dir
	private int y; // Size of map in y dir
	private Tile[][] map; // The map array is formatted like: Tile[y][x] WHERE top left corner is 0,0
	private int day;
	
	

	public void generate()
	{
		//this.x = x;
		//this.y = y; Already done
		this.map = new Tile[this.y][this.x];
		this.day = 0;
		
			/**
		 * Random number generator is used to set animal, vegetation, exhaustion level
		 */
		Random rn = new Random();		
		//Tile[][] mapp = new Tile[x][y];

		for(int n=0;n<y;n++){
			
			/*alternative method of printing to console while generating map
			if((n % 500)==0){
				System.out.print("x: ");
				System.out.println(n);
			}*/
			
			for(int m=0;m<x;m++){
				
				
				int randomExhaustion = rn.nextInt(2);
				
				int animalChance = rn.nextInt(16);
				int vegetationChance = rn.nextInt(13);
				int randomAnimal = 10;
				int randomVegetation = 3;
					
				if(animalChance == 1)
					 randomAnimal = rn.nextInt(10);

				if(vegetationChance == 1)	
					randomVegetation = rn.nextInt(3);
					
				//sim.initialize();
				Tile genTile = new Tile();
				genTile.generate(randomAnimal,randomVegetation,randomExhaustion);
					
				this.map[n][m] = genTile;
				/*The following print statements are used if Trevor wants to see the tile as it is generated*/
				/*
				if(genTile.getAnimal()!= null){
				System.out.print("x: ");
				System.out.print(n);
				System.out.print(" y: ");
				System.out.println(m);
				
				System.out.print(" Animal: ");
				System.out.println(genTile.getAnimal());
				
				System.out.print(" Vegetation: ");
				System.out.println(genTile.getVegetation());
				
				System.out.print(" ExhuastionLevel: ");
				System.out.println(genTile.getExhaustionLevel());
				}
				*/

			}
		}
		
	}
	
	public int getDay(){
		return this.day;
	}
	
	public Tile[][] getMap(){
		return this.map;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public List<String> nextDay()
	{
		List<String> events = new ArrayList<>();

		Random rand = new Random();

		events.add("Day: " + this.day);

		for(int m = 0; m < y; m++) // Y direction
		{
			for(int n = 0; n < x; n++) // X direction
			{
				if(getTile(n, m).getAnimal() != null && !(getTile(n, m).getAnimal().getDone()))
				{

					Tile tile = getTile(n, m);
					Animal animal = tile.getAnimal();
					Vegetation vegetation = tile.getVegetation();

					int speed = animal.getSpeed();

					// Handle hunger drop for the movement
					animal.changeHunger(speed * -1);

					int i = 0; // Overall Change in X direction
					int j = 0; // Overall Change in Y direction

					while(speed > 0)
					{
						int direction = rand.nextInt(4) + 1; //1 is up, 2 is right, 3 is down, 4 is left

						switch (direction)
						{
							case 1: j--; break;
							case 2: i++; break;
							case 3: j++; break;
							case 4: i--; break;
						}

						Tile moveTile = getTile(m + j, n + i);
						int exhaustion = moveTile.getExhaustionLevel();

						speed -= exhaustion;
						speed -= 1;

					}

					int m2 = m + j; // Coords of the destination tile in Y direction
					int n2 = n + i; // Coords of the destination tile in X direction

					// Ensuring we stay on the map
					if(m2 < 0)
						m2 = 0;
					if(n2 < 0)
						n2 = 0;
					if(m2 >= this.y)
						m2 = this.y - 1;
					if(n2 >= this.x)
						n2 = this.x - 1;

					if(n2 == n && m2 == m)
					{

						events.add(animal.getName() + " didn't move.");

						// Drop animal health if its hungry
						if(animal.getHunger() <= 0)
						{
							int dmg = (int)(Math.ceil((double)animal.getMaxHealth() * 0.05));
							animal.changeHealth(dmg);

							if(animal.dead())
							{
								tile.setAnimal(null);
								events.add(animal.getName() + " died by starvation.");
							}
							else
							{
								events.add(animal.getName() + " is slowly starving to death.");
							}
						}

					}
					else
					{

						events.add(animal.getName() + " at (" + n + "," + m + ") moved to (" + n2 + "," + m2 + ").");

						Tile tile2 = getTile(n2, m2);
						Animal animal2 = tile2.getAnimal();
						Vegetation vegetation2 = tile2.getVegetation();

						boolean killed = false;

						// Collision will happen
						if(animal2 != null)
						{ // Animal on Animal collision

							// Generating the overall eat level by taking into account predator vs prey
							int eatLevel = animal.getEatsLevel();
							if(animal.getEats() == EatType.PREDATOR)
								eatLevel += 1000;

							int eatLevel2 = animal2.getEatsLevel();
							if(animal2.getEats() == EatType.PREDATOR)
								eatLevel2 += 1000;

							if(eatLevel >= eatLevel2)
							{ // Animal eats the animal on the new tile
								animal.changeHunger(animal2.kill());
								tile2.setAnimal(animal);
								tile.setAnimal(null);

								events.add(animal.getName() + " encountered a " + animal2.getName() + " and killed it.");
							}
							else
							{ // Animal is eaten by the animal on the new tile
								animal2.changeHunger(animal.kill());
								tile.setAnimal(null);
								killed = true;

								events.add(animal.getName() + " encountered a " + animal2.getName() + " and was killed by it.");
							}

						} else if(vegetation2 != null) {
							// Animal on plant collision.
							tile2.setAnimal(animal);
							tile.setAnimal(null);

							tile2.getAnimal().changeHunger(vegetation2.eat());
							tile2.setVegetation(null);

							events.add(animal.getName() + " found " + vegetation2.getName() + " and ate it.");

						} else {
							// Simple animal movement
							tile2.setAnimal(animal);
							tile.setAnimal(null);
						}

						// Drop animal health if its hungry
						if(!killed && animal.getHunger() <= 0)
						{
							int dmg = (int)(Math.ceil((double)animal.getMaxHealth() * 0.05));
							animal.changeHealth(dmg);

							if(animal.dead())
							{
								tile2.setAnimal(null);
								events.add(animal.getName() + " died by starvation.");
							}
							else
							{
								events.add(animal.getName() + " is slowly starving to death.");
							}
						}

					}

					// Marking the animal as having moved already this day
					animal.setDone(true);

				}
			}
		}

		day++;

		// Resetting the animals to be ready for a new day
		for(int m = 0; m < y; m++) // Y direction
		{
			for(int n = 0; n < x; n++) // X direction
			{
				if(getTile(n, m).getAnimal() != null)
				{
					getTile(n, m).getAnimal().setDone(false);
				}
			}
		}

		return events;
	}
	
	public Tile getTile(int x, int y)
	{
		return this.map[y][x];
	}
	
	public int killAnimal(int x, int y)
	{
		Tile tile = getTile(x, y);
		if(tile.getAnimal() != null)
		{
			int food = tile.getAnimal().kill();
			tile.setAnimal(null);
			return food;
		}

		return 0;
	}
	
	public int killVegetation(int x, int y)
	{
		Tile tile = getTile(x, y);
		if(tile.getVegetation() != null)
		{
			int food = tile.getVegetation().eat();
			tile.setVegetation(null);
			return food;
		}

		return 0;
	}

}
