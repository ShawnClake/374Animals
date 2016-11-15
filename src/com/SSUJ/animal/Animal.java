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
	
	protected EatType eats;
	protected int eatsLevel;
	protected int hunger;
	protected int health;
	protected int speed;
	protected int maxHealth;
	protected int maxHunger;
	protected String name;
	protected String description;
	protected boolean done; // Whether or not the animal is done for the day or not

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
	return eats;	
	}
	
	public int getEatsLevel()
	{
		return eatsLevel;
	}
	
	public int getHunger()
	{
		return hunger;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setHunger(int hunger)
	{
		this.hunger = hunger;
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
		this.health = health;
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
		return maxHealth;
	}
	
	public int getMaxHunger()
	{
		return maxHunger;
	}

}







