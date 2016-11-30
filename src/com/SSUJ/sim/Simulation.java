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
	boolean tombWorld;

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
	
	public void initialize(int animalnum, int plantnum)
	{
		world.generate(animalnum, plantnum);			
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
				System.out.println("Press enter to continue.");
				in.nextLine();
				System.out.println("");
				ui.printWorld(world.getMap(), world.getX(), world.getY(), in);	
				int[] tempCounts = world.getCounts();
				
				//Print out the world stats
				System.out.println("Here are the current stats for the world");
				if(tempCounts[0] == 0 && tempCounts[1] == 0 && tempCounts[2] == 0 && tempCounts[3] == 0 && tempCounts[4] == 0 && tempCounts[5] == 0 && tempCounts[6] == 0 && tempCounts[7] == 0 && tempCounts[8] == 0 && tempCounts[9] == 0)	//If there are no animals
				{
					tombWorld = true;
					System.out.println("This is no world. It's a tomb!");
					
				} else
				{
					
					if(tempCounts[0] != 0)
						System.out.println("There are currently " + tempCounts[0] +  " Bluejays");
					if(tempCounts[1] != 0)
						System.out.println("There are currently " + tempCounts[1] +  " Caterpillars");
					if(tempCounts[2] != 0)
						System.out.println("There are currently " + tempCounts[2] +  " Deer");
					if(tempCounts[3] != 0)
						System.out.println("There are currently " + tempCounts[3] +  " Foxes");
					if(tempCounts[4] != 0)
						System.out.println("There are currently " + tempCounts[4] +  " Grasshopers");
					if(tempCounts[5] != 0)
						System.out.println("There are currently " + tempCounts[5] +  " Hawks");
					if(tempCounts[6] != 0)
						System.out.println("There are currently " + tempCounts[6] +  " Mice");
					if(tempCounts[7] != 0)
						System.out.println("There are currently " + tempCounts[7] +  " Rabbits");
					if(tempCounts[8] != 0)
						System.out.println("There are currently " + tempCounts[8] +  " Squirrels");
					if(tempCounts[9] != 0)
						System.out.println("There are currently " + tempCounts[9] +  " Wolves");
					if(tempCounts[10] != 0)
						System.out.println("There are currently " + tempCounts[10] + " Grasses");
					if(tempCounts[11] != 0)
						System.out.println("There are currently " + tempCounts[11] + " Shrubs");
					if(tempCounts[12] != 0)
						System.out.println("There are currently " + tempCounts[12] + " Trees");

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
