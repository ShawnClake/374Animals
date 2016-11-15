package com.SSUJ.animal;
import java.util.Random;
public class Mouse extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 5;		//Random number between 5-15
	
	
		eatsLevel = 4;
		hunger = 20;		
		health = x;
		speed = 2;
		maxHealth = 20;
		maxHunger = 20;
		name = "Mouse";
		description = "Mouse: Eats grass and from trees. Is eaten by the fox and hawk";
				
		eats = EatType.PREY;
		done = false;
		
		
	}
}
