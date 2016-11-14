package com.SSUJ.tile;

import com.SSUJ.vegetation.Grass;
import com.SSUJ.vegetation.Shrub;
import com.SSUJ.vegetation.Tree;
import com.SSUJ.vegetation.Vegetation;
import com.SSUJ.animal.Animal;
import com.SSUJ.animal.Bluejay;
import com.SSUJ.animal.Caterpillar;
import com.SSUJ.animal.Deer;
import com.SSUJ.animal.Fox;
import com.SSUJ.animal.Grasshoper;
import com.SSUJ.animal.Hawk;
import com.SSUJ.animal.Mouse;
import com.SSUJ.animal.Rabbit;
import com.SSUJ.animal.Squirrel;
import com.SSUJ.animal.Wolf;



/*******************************************************************************
 * Tile
 * 
 * Purpose: Represents a specific tile located in the world.
 * 
 *********************************************************************************/

public class Tile {
	
	private Animal animal;
	private Vegetation vegetation;
	private int exhaustionLevel;
	
	public void generate(int animalInt, int vegetationInt, int exhaustionInt)
	{

		//Animal selector

		switch(animalInt)
		{
			case 10: this.animal = null; break; // Not sure why we need this one?
			case 0: this.animal = new Bluejay(); break;
			case 1: this.animal = new Caterpillar(); break;
			case 2: this.animal = new Deer(); break;
			case 3: this.animal = new Fox(); break;
			case 4: this.animal = new Grasshoper(); break;
			case 5: this.animal = new Hawk(); break;
			case 6: this.animal = new Mouse(); break;
			case 7: this.animal = new Rabbit(); break;
			case 8: this.animal = new Squirrel(); break;
			case 9: this.animal = new Wolf(); break;
		}

		switch(vegetationInt)
		{
			case 0: this.vegetation = new Grass(); break;
			case 1: this.vegetation = new Shrub(); break;
			case 2: this.vegetation = new Tree(); break;
		}

			this.exhaustionLevel = exhaustionInt;
	
	}
	
	public Animal getAnimal()
	{
		return this.animal;
	}
	
	public void setAnimal(Animal animal)
	{
		this.animal = animal;
	}
	
	public Vegetation getVegetation()
	{
		return this.vegetation;
	}

	public void setVegetation(Vegetation vegetation)
	{
		this.vegetation = vegetation;
	}
	
	public int getExhaustionLevel()
	{
		return this.exhaustionLevel;
	}
	public void setExhaustionLevel(int exhaustL)
	{
		
		this.exhaustionLevel = exhaustL;
	}

}
