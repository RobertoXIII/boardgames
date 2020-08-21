package interfaces;

import java.util.ArrayList;

import model.Game;

public interface Subject {
	
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
	
}
