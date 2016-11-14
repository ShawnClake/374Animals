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
			if(animalInt >= 10){
				animal = null;	
			}
			else if(animalInt==0){
				animal = new Bluejay();
			}
			else if(animalInt==1){
				animal = new Caterpillar();
			}
			else if(animalInt==2){
				animal = new Deer();
			}
			else if(animalInt==3){
				animal = new Fox();
			}
			else if(animalInt==4){
				animal = new Grasshoper();	
			}
			else if(animalInt==5){
				animal = new Hawk();
			}
			else if(animalInt==6){
				animal = new Mouse();
			}
			else if(animalInt==7){
				animal = new Rabbit();
			}
			else if(animalInt==8){
				animal = new Squirrel();
			}
			else if(animalInt==9){
				animal = new Wolf();	
			}
			//Vegetation Selector
			if(vegetationInt == 0){
				vegetation = new Grass();

			}
			else if(vegetationInt==1){
				vegetation = new Shrub();

			}
			else if(vegetationInt==2){
				vegetation = new Tree();
			}
			
			exhaustionLevel = exhaustionInt;
	
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
