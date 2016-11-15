package com.SSUJ.animal;

public class Grasshoper extends Animal {

public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(10) + 1;		//Random number between 1-10
	
	
	
		eatsLevel = 2;
		hunger = 10;		
		health = x;
		speed = 1;
		maxHealth = 10;
		maxHunger = 10;
		name = "Grasshoper";
		description = "Grasshoper: Eats grass and from trees. Is eaten by the fox and hawk";
				
		eats = EatType.PREY;
		done = false;
		
		
	}
	
	
	
	
}
