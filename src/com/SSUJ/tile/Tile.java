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
		Animal animalChoice = null;
		Vegetation vegetationChoice = null;

		//Animal selector
			if(animalInt <= 11){
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
				Deer choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==15){
				Fox choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==16){
				Grasshoper choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==17){
				Hawk choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==18){
				Mouse choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==19){
				Rabbit choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==20){
				Squirrel choice = null;
				animalChoice = choice;	
			}
			else if(animalInt==21){
				Wolf choice = null;
				animalChoice = choice;	
			}
			//Vegetation Selector
			if(animalInt == 0){
				Grass choice = null;
				vegetationChoice = choice;	
			}
			else if(animalInt==1){
				Shrub choice = null;
				vegetationChoice = choice;	
			}
			else if(animalInt==2){
				Tree choice = null;
				vegetationChoice = choice;	
			}
			
			
			//Set all values for the tile
			this.setAnimal(animalChoice);
			this.setVegetation(vegetationChoice);
			this.setExhaustionLevel(exhaustionInt);			
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
