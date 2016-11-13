package com.SSUJ.animal;

public class Mouse extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 5;		//Random number between 5-15
	
	
		eatsLevel = 1;
		hunger = 0;		
		health = x;
		speed = 2;
		maxHealth = 20;
		maxHunger = 20;
		name = "Mouse";
		description = "Mouse: Eats grass and from trees. Is eaten by the fox and hawk";
				
		
		
		
	}
}
