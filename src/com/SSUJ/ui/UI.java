package com.SSUJ.ui;


import java.util.Scanner;

import com.SSUJ.tile.Tile;

import java.util.List;
/*******************************************************************************
 * UI
 * 
 * Purpose: This is the user interface.
 * 
 *********************************************************************************/

public class UI {
	
	private Scanner in;
	//private System.out out;
	
	public Scanner getIn(){
		return this.in;
	}
	
	/*public System.out getOut(){
		return this.out;
	}*/
	
	public void instructions(){
		//how the simulation works in general
		System.out.print("This is a simulation of Saskatchewan wildlife. It takes a certain number of "
		+"animals and vegetation and throw them into a real world simulation. The animals "
		+"and vegetation are randomly generated in the world and behave randomly as well. "
		+"Each animal is classified as either predator or prey, and each type of animal has "
		+"different characteristics such as hunger, speed, and eating levels. When two animals"
		+" end up in the same place, one sill eat the other. If and animal and some"
		+" vegetation end up in the same area, the animal will go and eat the vegetation. At the beginning"
		+ " you will be able to chose the size of the world you want these animals to live in as well as "
		+ "how many days you want the simulation to run for. The simulation will then begin for the set number"
		+ " of days specified.");
	}
	
	public void printWorld(Tile[][] map, int x, int y){
		//legend for map
		System.out.println("Tile Legend:");
		System.out.println("\t* represents vegeation");
		System.out.println("\t& represents an animal");
		System.out.println("\t# represents the presence of vegitation and an animal");
		System.out.println("The numbers on the right and bottom represent tile numbers.");
		//double loop to print out rest of map
		int xx = 0;
		int yy = 0;
		for(yy = 0; yy < y; yy++){
			for(xx = 0; xx < x; xx++){
				if(xx == 0){
					System.out.print("|");
				}
				System.out.print(printTileSymbol(map[yy][xx]) + "|");
			}
			System.out.print(yy);//row number
			System.out.println("");
		}
		//print out horizontal lines???
		//print out line of column numbers
		for(xx = 0; xx < x; xx++){
			if(xx == 0){
				System.out.print(" ");
			}
			if(xx < 10){
				System.out.print(" ");
			}
			System.out.print(xx +" ");
		}
		
		//give option to print out individual tile
		String print = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to print out and individual tile's stats?(enter anything for yes and 'no' for no):");
		print = in.nextLine();
		print = print.toLowerCase();
		while(!print.equals("no")){
			int xval;
			int yval;
			System.out.println("Enter the x-coordinate: ");
			xval = in.nextInt();
			System.out.println("Enter the y-coordinate: ");
			yval = in.nextInt();
			printTile(map[xval][yval]);
			System.out.println("Would you like to continue printing tiles? (enter no to stop): ");
			print = in.nextLine();
			print = print.toLowerCase();
		}
		in.close();
	}
	
	public char printTileSymbol(Tile t){
		//* represents a plant, & is an animal, # plant & animal, blank is none
		char symbol = ' ';
		if(t.getAnimal() != null && t.getVegetation() != null){
			symbol = '#';
		}
		else if(t.getAnimal() != null){
			symbol = '&';
		}
		else if(t.getVegetation() != null){
			symbol = '*';
		}
		
		return symbol;
	}
	
	public void printTile(Tile tile){
		//animals: name, description, eatType, eatslevel, hunger/max, health/max, speed
		if(tile.getAnimal() != null){
			System.out.println("Animal name: " + tile.getAnimal().getName());
			System.out.println("Description: " + tile.getAnimal().getDescription());
			System.out.println("Type: "+ tile.getAnimal().getEats());
			System.out.println("Eating Level: " + tile.getAnimal().getEatsLevel());
			System.out.println("Hunger: " + tile.getAnimal().getHunger() + "/" + tile.getAnimal().getMaxHunger());
			System.out.println("Health: " + tile.getAnimal().getHealth() + "/" + tile.getAnimal().getMaxHealth());
			System.out.println("Speed: " + tile.getAnimal().getSpeed());
		}
		else{
			System.out.println("No animal on tile.");
		}
		
		//vegetation: name, description, foodlevel/max
		if(tile.getVegetation() != null){
			System.out.println("Veg. Name: " + tile.getVegetation().getName());
			System.out.println("Description: " + tile.getVegetation().getDescription());
			System.out.println("Food Level: " + tile.getVegetation().getFoodLevel() + "/" + tile.getVegetation().getMaxFoodLevel());
		}
		else{
			System.out.println("No vegetation present on tile.");
		}
	}
	
	public void log(List<String> dayEvents){
		//printing out the days events
		//may need a loop instead
		for(int i = 0; i < dayEvents.size(); i++){
			System.out.println(dayEvents.get(i));
		}
	}
	
	public void daysRemaining(int days, int day){
		int remaining = days - day;
		System.out.println("Days remaining: " + remaining);
	}

}
