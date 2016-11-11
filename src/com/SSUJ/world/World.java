package com.SSUJ.world;

import com.SSUJ.animal.Animal;
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
	
	public void generate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public List<String> nextDay()
	{
		List<String> events = new ArrayList<>();

		Random rand = new Random();

		for(int m = 0; m < y; m++) // Y direction
		{
			for(int n = 0; n < x; n++) // X direction
			{
				if(getTile(n, m).getAnimal() != null && !(getTile(n, m).getAnimal().getDone()))
				{

					Tile tile = getTile(n, m);
					Animal animal = tile.getAnimal();
					Vegetation vegetation = tile.getVegetation();

					int exhaustion = tile.getExhaustionLevel();
					int speed = animal.getSpeed() - exhaustion;

					int i = 0; // Overall Change in X direction
					int j = 0; // Overall Change in Y direction

					for(int k = 0; k < speed; k++)
					{
						int direction = rand.nextInt(4) + 1; //1 is up, 2 is right, 3 is down, 4 is left
						switch (direction)
						{
							case 1: j--; break;
							case 2: i++; break;
							case 3: j++; break;
							case 4: i--; break;
						}
					}

					int m2 = m + j; // Coords of the destination tile in Y direction
					int n2 = n + i; // Coords of the destination tile in X direction

					if(m2 < 0)
						m2 = 0;
					if(n2 < 0)
						n2 = 0;
					if(m2 >= this.y)
						m2 = this.y - 1;
					if(n2 >= this.x)
						n2 = this.x - 1;


				}
			}
		}

		day++;

		return events;
	}
	
	public Tile getTile(int x, int y)
	{
		
	}
	
	public void killAnimal(int x, int y)
	{
		
	}
	
	public void killVegetation(int x, int y)
	{
		
	}

}
