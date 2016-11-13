package com.SSUJ.ui;

import java.io.*;
import java.util.Scanner;
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
		
	}
	
	public void log(List<String> dayEvents){
		//printing out the days events
		System.out.println(Arrays.toString(dayEvents.toArray()));
	}
	
	public void daysRemaining(){
		System.out.println("Days remaining: ");
	}

}
