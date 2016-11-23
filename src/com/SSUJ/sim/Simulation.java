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
	bool tombWorld;

	public Simulation(){
		ui = new UI();
		world = new World();
		tombWorld = false;
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
	
	public void simulate(Scanner in){
		//loop through days
		String cont = "go";
		int daysToSkip = 0;
		for(int i = 0; i <= this.length; i++){
			//call next day & print out log
			System.out.println("");
			nextDay();
			//print out world
			if(cont.equals("go")){
				in.nextLine();
				System.out.println("Press enter to continue.");
				System.out.println("");
				ui.printWorld(world.getMap(), world.getX(), world.getY(), in);	
				
				
				//Print out the world stats
				System.out.println("Here are the current stats for the world");
				if(counts[0] == 0 && counts[1] == 0 && counts[2] == 0 && counts[3] == 0 && counts[4] == 0 && counts[5] == 0 && counts[6] == 0 && counts[7] == 0 && counts[8] == 0 && counts[9] == 0)	//If there are no animals
				{
					tombWorld = true;
					System.out.println("This is no world. It's a tomb!");
					
				} else
				{
					System.out.println("There are currently {0} Bluejays", count[0]);
					System.out.println("There are currently {0} Caterpillars", count[1]);
					System.out.println("There are currently {0} Deer", count[2]);
					System.out.println("There are currently {0} Foxex", count[3]);
					System.out.println("There are currently {0} Grasshopers", count[4]);
					System.out.println("There are currently {0} Hawks", count[5]);
					System.out.println("There are currently {0} Mice", count[6]);
					System.out.println("There are currently {0} Rabbits", count[7]);
					System.out.println("There are currently {0} Squirrels", count[8]);
					System.out.println("There are currently {0} Wolves", count[9]);
					System.out.println("There are currently {0} Grasses", count[10]);
					System.out.println("There are currently {0} Shrubs", count[11]);
					System.out.println("There are currently {0} Trees", count[12]);
				}
				
				
				
			//print out days remaining
				ui.daysRemaining(length, world.getDay());
			}
			if(cont.equals("day")){
				daysToSkip--;//after each day reduce the days to skip
			}
			if(daysToSkip - 1 == 0){
				in.nextLine();
			}
			
			if(daysToSkip == 0){//only print this if not skipping days
				System.out.println("");
				//no matter what log will print
				System.out.println("You may now deside how to continue the simulation.");
				System.out.println("Chose from the following options:");
				System.out.println("\t'go' : continue the simulation, stopping after each day to print maps, tiles, and days remaing.");
				System.out.println("\t'end' : skip to end of simulation only printing the logs for each day.");
				System.out.println("\t'day' : skip a certain number of days only printing logs for skipped days.");
				System.out.println("\t'quit' : quit the simulation and return to the main menu.");
				cont = in.nextLine();
				cont = cont.toLowerCase();
				while((!cont.equals("go")) && (!cont.equals("end")) && (!cont.equals("day")) && (!cont.equals("quit"))){
					System.out.println("Invalid choice!");
					System.out.println("Please enter only 'go', 'end', 'day', or 'quit':");
					cont = in.nextLine();
					cont = cont.toLowerCase();
				}
				//continue printing everything == go, here nothing changes
				//skip to end == end make days 60
				if(cont.equals("end")){
					daysToSkip = 60;
				}
				//skip to certain day == day and enter int days
				if(cont.equals("day")){
					System.out.println("Enter number of days to skip:");
					System.out.println("NOTE: If number you enter is larger than days remaining, simulation will skip to end.");
					daysToSkip = in.nextInt();
				}
				//end = quit
				if(cont.equals("quit")){
					System.out.println("Returning to main menu...");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					break;
				}
				//if last day is the next day, print out everything anyways
				if((i + 1) == this.length){
					cont = "go";
				}
				//if last day, pause before exiting to main menu
				if(i == this.length){
					System.out.println("Simulation is over.");
					System.out.println("To continue back to main menu, press enter.");
					cont = in.nextLine();
				}
				
			}
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
}
