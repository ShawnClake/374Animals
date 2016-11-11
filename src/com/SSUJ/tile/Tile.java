package com.SSUJ.tile;

import com.SSUJ.vegetation.Vegetation;
import com.SSUJ.animal.Animal;
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
	
	public void generate()
	{
		
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

}
