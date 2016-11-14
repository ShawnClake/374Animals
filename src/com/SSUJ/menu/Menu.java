package com.SSUJ.menu;

import com.SSUJ.sim.Simulation;
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
		
		Simulation sim = new Simulation(100);
		sim.initialize(100);
		System.out.print("done");

	}
	
	public void begin(){

	}
	
	public void quit(){
		
	}
	
	public void about(){
		
	}

}
