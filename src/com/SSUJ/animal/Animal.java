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
	private boolean done; // Whether or not the animal is done for the day or not

	public boolean getDone()
	{
		return this.done;
	}

	public void setDone(boolean done)
	{
		this.done = done;
	}

	public void generate()
	{
		
	}
	
	public EatType getEats()
	{
		
	}
	
	public int getEatsLevel()
	{
		
	}
	
	public int getHunger()
	{
		
	}
	
	public int getHealth()
	{
		
	}
	
	public int getSpeed()
	{
		
	}
	
	public String getName()
	{
		
	}
	
	public String getDescription()
	{
		
	}
	
	public void setHunger(int hunger)
	{
		
	}
	
	public void changeHunger(int hunger)
	{
		this.hunger += hunger;
		if(this.hunger > this.maxHunger)
			this.hunger = this.maxHunger;
		if(this.hunger < 0)
			this.hunger = 0;
	}
	
	public void setHealth(int health)
	{
		
	}
	
	public void changeHealth(int health)
	{
		this.health += health;
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
		if(this.health < 0)
			this.health = 0;
	}

	public boolean dead()
	{
		return this.health <= 0;
	}
	
	public int kill()
	{
		//return its current health prior to kill as food for eater to add
		int tempHealth = health;
		health = 0;
		return tempHealth;
	}
	
	public int getMaxHealth()
	{
		
	}
	
	public int getMaxHunger()
	{
		
	}

}







