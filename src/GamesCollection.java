import java.util.ArrayList;

import interfaces.*;
import model.Game;

public class GamesCollection implements Subject {

	private ArrayList<Observer> observers;
	private ArrayList<Game> games;
	
	public GamesCollection() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);		
	}

	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(games);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void addGame(Game newGame) {
		// Add the game to the list if it's not found.
		int i = games.indexOf(newGame);
		if(i < 0) {
			games.add(newGame);
		}
	}
	
	public ArrayList<Game> getGames() {
		return this.games;
	}

}
