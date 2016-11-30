package com.SSUJ.animal;

import java.util.Random;

public class Caterpillar extends Animal {

	
	
	
	
	public void generate(){
		
		
		Random ran = new Random();
		int x = ran.nextInt(10) + 1;		//Random number between 1-10
		
		
		eatsLevel = 1;
		hunger = 10;		
		health = x;
		speed = 1;
		maxHealth = 10;
		maxHunger = 10;
		name = "Catepillar";
		description = "Catepillar: Eats leaves only and is eaten by bluejay";
				
		eats = EatType.PREY;
		done = false;
		
		
		
	}
	
	
}
