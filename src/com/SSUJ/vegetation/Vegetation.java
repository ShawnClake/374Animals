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
		
	}
	
	public String getName()
	{
		
	}
	
	public String getDescription()
	{
		
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
		
	}

}
