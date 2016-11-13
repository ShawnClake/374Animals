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
			while(choice != "begin" || choice != "quit" || choice != "about"){
				System.out.println("That was not a correct choice.");
				System.out.println("Please enter either 'begin', 'quit', or 'about'");
			}
			if(choice.equals("begin")){
				begin(simulation);
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
	
	public static void begin(Simulation sim){
		sim.getUI().instructions();
		//get days and x and y sizes
		
		//initialize the simulation
		sim.initialize();
		//run the simulation
		sim.simulate();
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
		System.out.print("Animals was created by SSUJ for the Sask Wildlife federation. ");
		
	}

}
