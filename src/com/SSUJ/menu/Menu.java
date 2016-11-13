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
		System.out.println("Please select one of the following options:");
		System.out.println("Begin -> begin the simulation.");
		System.out.println("Quit -> quit the simulation.");
		System.out.println("About -> get information about this simulation.");
		
		
	}
	
	public void begin(){
		
	}
	
	public void quit(){
		System.out.println("Quitting the simulation...");
	}
	
	public void about(){
		
	}

}
