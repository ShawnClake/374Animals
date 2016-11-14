package com.SSUJ.vegetation;

/*******************************************************************************
 * Vegetation
 * 
 * Purpose: Represents the plants present on a tile.
 * 
 *********************************************************************************/

public class Vegetation {
	
	private int foodLevel;
	private String name;
	private String description;
	private int maxFoodLevel;
	
	public void generate()
	{
		
	}
	
	public int getFoodLevel()
	{
		return this.foodLevel;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public int eat()
	{
		//returns the food level
		int tempFood = this.foodLevel;
		this.foodLevel = 0;
		return tempFood;
	}
	
	public int getMaxFoodLevel()
	{
		return this.maxFoodLevel;
	}

}
