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
	}
	
	public void printWorld(Tile[][] map){
		//double loop to print out rest of map
		//print row number, then tiles
		//* represents a plant, & is an animal, # plant & animal, use print tile symbol to determine these

		//print out line of column numbers
		
		//give option to print out individual tile
	}
	
	public void printTileSymbol(){
		
	}
	
	public void printTile(Tile tile){
		//animals
		tile.getAnimal();
		//print out values
		
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
