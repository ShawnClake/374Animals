package com.SSUJ.animal;

public class Bluejay extends Animal {

	
public void generate(){
		
	Random ran = new Random();
	int x = ran.nextInt(11) + 10;		//Random number between 10-20
	
	
		eatsLevel = 2;
		hunger = 0;		//All animals start at zero hunger. 
		health = x;
		speed = 3;
		
		
		maxHealth = 30;
		maxHunger = 30;
		name = "Bluejay";
		description = "Bluejay: Eats from shrubs and catepillars. Is eaten by the fox.";
		
		
				
		
		
		
	}
}
