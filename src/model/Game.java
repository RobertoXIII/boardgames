package model;

import java.util.ArrayList;

public class Game {
	
	private String name;
	private String publisher;
	private int minPlayers;
	private int maxPlayers;
	private int averageGameTime;
	private ArrayList<String> mechanics;

	public Game() {
		
	}
	
	public Game(String name, String publisher) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getMinPlayers() {
		return minPlayers;
	}

	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public int getAverageGameTime() {
		return averageGameTime;
	}

	public void setAverageGameTime(int averageGameTime) {
		this.averageGameTime = averageGameTime;
	}

	public ArrayList<String> getMechanics() {
		return mechanics;
	}

	public void addMechanic(String mechanic) {
		// Add the game to the list if it's not found.
		int i = mechanics.indexOf(mechanic);
		if(i < 0) {
			mechanics.add(mechanic);
		}
	}
}
