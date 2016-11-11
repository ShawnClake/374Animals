package com.SSUJ.world;

import com.SSUJ.animal.Animal;
import com.SSUJ.tile.Tile;
import com.SSUJ.vegetation.Vegetation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*******************************************************************************
 * World
 * 
 * Purpose: This is the world that the animals roam in.
 * 
 *********************************************************************************/

public class World {

	private int x; // Size of map in x dir
	private int y; // Size of map in y dir
	private Tile[][] map; // The map array is formatted like: Tile[y][x]
	private int day;
	
	public void generate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public List<String> nextDay()
	{
		List<String> events = new ArrayList<>();

		Random rand = new Random();

		for(int m = 0; m < y; m++)
		{
			for(int n = 0; n < x; n++)
			{
				if(getTile(n, m).getAnimal() != null && !(getTile(n, m).getAnimal().getDone()))
				{

					Tile tile = getTile(n, m);
					Animal animal = tile.getAnimal();
					Vegetation vegetation = tile.getVegetation();

					int exhaustion = tile.getExhaustionLevel();
					int speed = animal.getSpeed();
					int direction = rand.nextInt(4) + 1;

				}
			}
		}

		day++;

		return events;
	}
	
	public Tile getTile(int x, int y)
	{
		
	}
	
	public void killAnimal(int x, int y)
	{
		
	}
	
	public void killVegetation(int x, int y)
	{
		
	}

}
