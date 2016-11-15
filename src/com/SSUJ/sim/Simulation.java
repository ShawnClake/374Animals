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

	public Simulation(){
		ui = new UI();
		world = new World();
	}
	
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
		world.generate();			
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
		String cont = "go";
		int daysToSkip = 0;
		for(int i = 0; i <= this.length; i++){
			//call next day & print out log
			nextDay();
			//print out world
			if(cont == "go"){
				ui.printWorld(world.getMap(), world.getX(), world.getY());	
			//print out days remaining
				ui.daysRemaining(length, world.getDay());
			}
			if(cont == "day"){
				daysToSkip--;//after each day reduce the days to skip
			}
			if(daysToSkip == 0){//only print this if not skipping days
				Scanner in = new Scanner(System.in);
				//no matter what log will print
				System.out.println("You may now deside how to continue the simulation.");
				System.out.println("Chose from the following options:");
				System.out.println("\t'go' : continue the simulation, stopping after each day to print maps, tiles, and days remaing.");
				System.out.println("\t'end' : skip to end of simulation only printing the logs for each day.");
				System.out.println("\t'day' : skip a certain number of days only printing logs for skipped days.");
				System.out.println("\t'quit' : quit the simulation and return to the main menu.");
				cont = in.nextLine();
				cont = cont.toLowerCase();
				while((cont!="go") && (cont!="end") && (cont!="day") && (cont!="quit")){
					System.out.println("Invalid choice!");
					System.out.println("Please enter only 'go', 'end', 'day', or 'quit':");
					cont = in.nextLine();
					cont = cont.toLowerCase();
				}
				//continue printing everything == go, here nothing changes
				//skip to end == end make days 60
				if(cont == "end"){
					daysToSkip = 60;
				}
				//skip to certain day == day and enter int days
				if(cont == "day"){
					System.out.println("Enter number of days to skip:");
					System.out.println("NOTE: If number you enter is larger than days remaining, simulation will skip to end.");
					daysToSkip = in.nextInt();
				}
				//end = quit
				if(cont == "quit"){
					System.out.println("Returning to main menu...");
					break;
				}
				//if last day is the next day, print out everything anyways
				if((i + 1) == this.length){
					cont = "go";
				}
				//if last day, pause befor exiting to main menu
				if(i == this.length){
					System.out.println("Simulation is over.");
					System.out.println("To continue back to main menu, press enter.");
					cont = in.nextLine();
				}
				in.close();
			}
			
		}
	}
	
}
