package com.SSUJ.menu;

import com.SSUJ.sim.Simulation;
import java.util.Scanner;
/*******************************************************************************
 * Menu
 * 
 * Purpose: This provides the user the ability to start the simulation, learn
 * 		about the simulation, or quit the simulation.
 * 
 *********************************************************************************/
public class Menu {
	
	
	
	public static void main(String [] args)
	{
		Simulation simulation = new Simulation(); //sim that will be run
		
		System.out.println("Welcome to Animals!");
		String choice = "";
		RUN:
		while(!choice.equals("quit")){
			System.out.println("Please select one of the following options:");
			System.out.println("Begin -> begin the simulation.");
			System.out.println("Quit -> quit the simulation.");
			System.out.println("About -> get information about this simulation.");
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter either \"Begin\", \"Quit\", or \"About\":");
			choice = in.nextLine();
			
			choice = choice.toLowerCase();
			while(!choice.equals("begin") && !choice.equals("quit") && !choice.equals("about")){
				System.out.println("That was not a correct choice.");
				System.out.println("Please enter either 'begin', 'quit', or 'about'");
				choice = in.nextLine(); 
				choice = choice.toLowerCase();
			}
			if(choice.equals("begin")){
				begin(simulation, in);
				continue RUN;
			}
			if(choice.equals("about")){
				about();
				continue RUN;
			}
			in.close();
		}
		//quitting the program
		quit();
		
	}
	
	public static void begin(Simulation sim, Scanner in){
		sim.getUI().instructions();
		//get days and x and y sizes
		System.out.println("Chose the number of days to run the simulation for (an integer value with a max of 600)");
		int days = in.nextInt();//max length
		while(days > 600 || days < 1){
			System.out.println("Please enter correct value from 1 to 600:");
			days = in.nextInt();
		}
		sim.setLength(days);
		
		//x and y sizes
		System.out.println("Now we need to set the size of the grid the simulation will be ran on.");
		System.out.println("NOTE: Max allowed size is 100x100.");
		System.out.println("While also select the number of animals/plants that are generated or allow them to be random.");
		System.out.println("NOTE: Max allowed is the total tiles, therefore 10,000 for a 100x100 grid");

		System.out.println("Enter value for x coordinate:");
		int xcoor = in.nextInt();

		while(xcoor > 100){
			System.out.println("The x -coordinate can be no larger than 100.");
			System.out.println("Please enter new value for x-coordinate length:");
			xcoor = in.nextInt();

		}
		System.out.println("Enter value for y coordinate:");
		int ycoor = in.nextInt();
		in.nextLine(); //necessary for eating nextline character

		while(ycoor > 100){
			System.out.println("The y-coordinate can be no larger than 100.");
			System.out.println("Please enter new value for y-coordinate length:");
			ycoor = in.nextInt();
			in.nextLine();
		}
		
		//set x and y lengths
		sim.getWorld().setX(xcoor);
		sim.getWorld().setY(ycoor);
		
		int numberOfTiles = xcoor*ycoor;
		int animalNumber;
		
		do {
			System.out.println("Enter value for percentage of animals, maximum is 100:");
			System.out.println("Enter 'NO' if you would like to go with standard percentage of animals. ");

			String animalChoice = in.nextLine();
			try {
				animalNumber = Integer.parseInt(animalChoice);
			} catch (NumberFormatException e) {
				animalNumber = 6; //default 6.25%
			}
		} while  (animalNumber > numberOfTiles);
		
		int plantNumber;

		do {
			System.out.println("Enter value for number of plants, maximum is 100:");
			System.out.println("Enter 'NO' if you would like to go with standard percentage of plants. ");
			String plantChoice = in.nextLine();
			try {
				plantNumber = Integer.parseInt(plantChoice);
			} catch (NumberFormatException e) {
				plantNumber = 8; //default 8.33%
			}
		} while  (plantNumber > numberOfTiles);
		
		//initialize the simulation
		sim.initialize(animalNumber, plantNumber);
		//run the simulation
		sim.simulate(in);
		
	}
	
	public static void quit(){
		System.out.println("Quitting the simulation...");
	}
	
	public static void about(){
		System.out.println("Animals");
		System.out.println("Version 0.1");
		System.out.println("2016 - SSUJ ");
		System.out.println("Authors: Shawn Clake, Jennifer Herasymuik, Sam Dietrich, Uys Kriek");
		System.out.println("");
		System.out.println("Animals was created by SSUJ for the Sask Wildlife federation. ");
		System.out.println("");
		System.out.println("");
		
	}

}
