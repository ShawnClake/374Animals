package com.SSUJ.tile;

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
		Animal animalChoice = null;
		
			if(animalInt < 11){
				animalChoice = null;	
			}
			else if(animalInt==12){
				Bluejay choice = null;
				animalChoice = choice;				
			}
			else if(animalInt==13){
				Caterpillar choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==14){
				Bluejay choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==15){
				Bluejay choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==16){
				Bluejay choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==17){
				Bluejay choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==18){
				Bluejay choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==19){
				Bluejay choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==20){
				Bluejay choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==21){
				Bluejay choice = null;
				animalChoice = choice;	
			}
			
			this.setAnimal(animalChoice);
		
			
			
			
			
			
			
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
