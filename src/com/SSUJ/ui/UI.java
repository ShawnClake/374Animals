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
	private System.out out;
	
	public Scanner getIn(){
		return this.in;
	}
	
	public System.out getOut(){
		return this.out;
	}
	
	public void instructions(){
		//does this give the option to print world??
	}
	
	public void printWorld(){
		//print out line of column numbers
		//double loop to print out rest of map
		//print row number, then tiles
		//* represents a plant, & is an animal
	}
	
	public void printTile(int x, int y){
		Tile tile = world.map[x][y];
		//animals
		Animal animal = tile.getAnimal();
		//vegetation
		Vegetation veg = tile.getVegetation();
	}
	
	public void log(List<String> dayEvents){
		//printing out the days events
		System.out.println(Arrays.toString(dayEvents.toArray()));
	}
	
	public void daysRemaining(int days, int day){
		int remaining = days - day;
		System.out.println("Days remaining: " + remaining + ".");
	}

}
