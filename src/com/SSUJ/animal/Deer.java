package com.SSUJ.animal;
import java.util.Random;
public class Deer extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 25;		//Random number between 25-35
	
		eatsLevel = 6;	//Problem with this design: Animals may eat out of their designated prey, hawk eating deer or something. Need to extend this so that animals are more picky
		hunger = 60;		//All animals start at zero hunger. 
		health = x;	
		speed = 4;
		maxHealth = 60;
		maxHunger = 60;
		name = "Deer";
		description = "Deer: Eats grass and shrubs, but is only eaten by the wolf";
				
		eats = EatType.PREY;
		done = false;
		
		
	}
}
