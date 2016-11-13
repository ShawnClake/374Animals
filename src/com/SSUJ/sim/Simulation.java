package com.SSUJ.sim;

import com.SSUJ.ui.UI;
import com.SSUJ.world.World;
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
		return world;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int setLength(int l)
	{
		this.length = l;
		return length;
	}
	
	public void initialize()
	{
		/**
		 * Calls generate from world for as many tiles as are needed, default is 
		 */
		world.generate(25,25);


		
	}
	
	public UI getUI()
	{
		return ui;
	}
	
	public void nextDay()
	{
		ui.log(world.nextDay());
	}
	
}
