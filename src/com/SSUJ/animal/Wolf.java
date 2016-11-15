package com.SSUJ.animal;
import java.util.Random;
public class Wolf extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 40;		//Random number between 10-20
	
		eatsLevel = 4;
		hunger = 90;		//All animals start at a random hunger between 0-5 // Hunger is between 0-10 for catepillars
		health = x;
		speed = 5;
		maxHealth = 90;
		maxHunger = 90;
		name = "Wolf";
		description = "Wolf: Eats squirrels and deer. Is an apex predator";
				
		eats = EatType.PREDATOR;
		done = false;
		
		
	}
}
