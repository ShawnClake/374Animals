package com.SSUJ.ui;

import java.io.*;
import java.util.Scanner;

import com.SSUJ.tile.Tile;

import java.util.List;
import java.util.Arrays;
/*******************************************************************************
 * UI
 * 
 * Purpose: This is the user interface.
 * 
 *********************************************************************************/

public class UI {
	
	private Scanner in;
	//private System.out out;
	
	public Scanner getIn(){
		return this.in;
	}
	
	/*public System.out getOut(){
		return this.out;
	}*/
	
	public void instructions(){
		//how the simulation works in general
		System.out.print("This is a simulation of Saskatchewan wildlife. It takes a certain number of "
		+"animals and vegetation and throw them into a real world simulation. The animals "
		+"and vegetation are randomly generated in the world and behave randomly as well. "
		+"Each animal is classified as either predator or prey, and each type of animal has "
		+"different characteristics such as hunger, speed, and eating levels. When two animals"
		+" end up in the same place, one sill eat the other. If and animal and some"
		+" vegetation end up in the same area, the animal will go and eat the vegetation. At the beginning"
		+ " you will be able to chose the size of the world you want these animals to live in as well as "
		+ "how many days you want the simulation to run for. The simulation will then begin for the set number"
		+ " of days specified.");
	}
	
	public void printWorld(Tile[][] map){
		//double loop to print out rest of map
		//print row number, then tiles
		

		//print out line of column numbers
		
		//give option to print out individual tile
	}
	
	public char printTileSymbol(Tile t){
		//* represents a plant, & is an animal, # plant & animal, blank is none
		char symbol = ' ';
		
		
		return symbol;
	}
	
	public void printTile(Tile tile){
		//animals
		tile.getAnimal();
		
		
		//vegetation
		tile.getVegetation();
	}
	
	public void log(List<String> dayEvents){
		//printing out the days events
		//may need a loop instead
		System.out.println(Arrays.toString(dayEvents.toArray()));
	}
	
	public void daysRemaining(int days, int day){
		int remaining = days - day;
		System.out.println("Days remaining: " + remaining + ".");
	}

}
