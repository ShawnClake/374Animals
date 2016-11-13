package com.SSUJ.animal;

public class Rabbit extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 10;		//Random number between 10-20
	
	
		eatsLevel = 1;
		hunger = 0;		
		health = x;
		speed = 3;
		maxHealth = 30;
		maxHunger = 30;
		name = "Rabbit";
		description = "Rabbit: Eats grass only and is eaten by wolves and foxes";
				
		
		
		
	}
}
