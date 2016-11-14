package com.SSUJ.sim;

import com.SSUJ.ui.UI;
import com.SSUJ.world.World;
import java.util.Scanner;
/*****************************************************************************************************
 * Simulation
 * 
 * Purpose: This is the base of the simulation. It has access to a user interface, contains a length
 * 		that the sim will run for, as well as a world the sim is run in.
 *****************************************************************************************************/

public class Simulation {

	private World world;//world sim will be ran in
	private int length;
	private UI ui;
	
	public World getWorld()
	{
		return this.world;
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	public void setLength(int l)
	{
		this.length = l;
	}
	
	public void initialize()
	{
		
	}
	
	public UI getUI()
	{
		return this.ui;
	}
	
	public void nextDay()
	{
		ui.log(world.nextDay());
	}
	
	public void simulate(){
		//loop through days
		boolean cont = true;
		for(int i = 0; i <= this.length; i++){
			//call next day & print out log
			
			nextDay();
			//print out world
			if(cont){
				ui.printWorld(world.getMap(), world.getX(), world.getY());	
			//print out days remaining
				ui.daysRemaining(length, world.getDay());
			}
			//give user option to skip to end or continue
			
			while(cont){
				Scanner in = new Scanner(System.in);
				//give user option to stop at each day enter, continue to end printing out logs #, or quit
				//skip to a day by adding days
				
			}
			
		}
	}
	
}
