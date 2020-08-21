package view;

import java.util.ArrayList;

import interfaces.DisplayList;
import interfaces.Observer;
import interfaces.Subject;
import model.Game;

public class EntireCollectionDisplay implements DisplayList, Observer {
	
	private Subject gamesCollection;
	
	public EntireCollectionDisplay(Subject gamesCollection) {
		this.gamesCollection = gamesCollection;
		gamesCollection.registerObserver(this);
	}

	public void update(Subject gamesCollection) {
		this.gamesCollection = gamesCollection;
		display();
		
	}

	public void display() {
		for(Game g : games) {
			System.out.println("Name:\t" + g.getName() + "\tPublisher:\t" + g.getPublisher());
		}
	}
}
