package com.SSUJ.animal;

public class Fox extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 30;		//Random number between 30-40
	
	
		eatsLevel = 5;
		hunger = 0;		
		health = x;
		speed = 4;
		maxHealth = 70;
		maxHunger = 70;
		
		name = "Fox";
		description = "Fox: Eats bluejays, squirrels, mice, and rabbits. Is an apex predator.";
				
		
		
		
	}
}
