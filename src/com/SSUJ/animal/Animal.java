package com.SSUJ.animal;

/*******************************************************************************
 * Animal
 * 
 * Purpose: This class represents an individual animal placed on a tile. There are
 * 		multiple types of animals, each of which will either be a predator or the
 * 		prey.
 * 
 * Notes: An animals health and hunger can fluctuate, but it's speed will NEVER change
 *              An animals range of movement accross tiles is speed - Tile.getExhaustionLevel()
                When an animal is eaten, it's health determines how much food the eating animal is given
		Predator > Prey
		Predator with higher eatsLevel > Predator with lower eatsLevel
		Prey with higher eatsLevel > Prey with lower eatsLevel
		changeHealth and changeHunger are realitve whereas setHealth and setHunger are absolute
 *********************************************************************************/

public class Animal {
	
	private EatType eats;
	private int eatsLevel;
	private int hunger;
	private int health;
	private int speed;
	private int maxHealth;
	private int maxHunger;
	private String name;
	private String description;
	
	public void generate(){
		
	}
	
	public EatType getEats(){
		
	}
	
	public int getEatsLevel(){
		
	}
	
	public int getHunger(){
		
	}
	
	public int getHealth(){
		
	}
	
	public int getSpeed(){
		
	}
	
	public String getName(){
		
	}
	
	public String getDescription(){
		
	}
	
	public void setHunger(int hunger){
		
	}
	
	public void changeHunger(int hunger){
		
	}
	
	public void setHealth(int health){
		
	}
	
	public void changeHealth(int health){
		
	}
	
	public int kill(){
		//return its current health prior to kill as food for eater to add
	}
	
	public int getMaxHealth(){
		
	}
	
	public int getMaxHunger(){
		
	}

}







