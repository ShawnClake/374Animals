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
	
	private Simulation simulation; //sim that will be run
	
	public static void main(String [] args)
	{
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
				begin();
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
	
	public static void begin(){
		
	}
	
	public static void quit(){
		System.out.println("Quitting the simulation...");
	}
	
	public static void about(){
		
	}

}
