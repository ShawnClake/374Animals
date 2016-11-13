package com.SSUJ.animal;

public class Hawk extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 15;		//Random number between 10-20
	
	
		eatsLevel = 5;
		hunger = 0;		
		health = x;
		speed = 5;
		maxHealth = 40;
		maxHunger = 40;
		name = "Hawk";
		description = "Hawk: Eats mice and squirrels. Is an apex predator.";
				
		
		
		
	}
	
	
}
