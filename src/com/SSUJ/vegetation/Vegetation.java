package com.SSUJ.vegetation;

/*******************************************************************************
 * Vegetation
 * 
 * Purpose: Represents the plants present on a tile.
 * 
 *********************************************************************************/

public class Vegetation {
	
	protected int foodLevel;
	protected String name;
	protected String description;
	protected int maxFoodLevel;
	
	public void generate()
	{
			
	}
	
	public int getFoodLevel()
	{
		return foodLevel;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
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
		return maxFoodLevel;
	}

}
