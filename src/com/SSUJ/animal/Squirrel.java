package com.SSUJ.animal;
import java.util.Random;
public class Squirrel extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 10;		//Random number between 10-20
	
		eatsLevel = 3;
		hunger = 30;		
		health = x;
		speed = 2;
		maxHealth = 30;
		maxHunger = 30;
		name = "Squirrel";
		description = "Squirrel: Eats only from trees. Is eaten by foxes";
				
		eats = EatType.PREY;
		done = false;
		
		
	}
}
