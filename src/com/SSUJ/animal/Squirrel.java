package com.SSUJ.animal;

public class Squirrel extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 10;		//Random number between 10-20
	
		eatsLevel = 1;
		hunger = 0;		
		health = x;
		speed = 2;
		maxHealth = 30;
		maxHunger = 30;
		name = "Squirrel";
		description = "Squirrel: Eats only from trees. Is eaten by foxes";
				
		
		
		
	}
}
