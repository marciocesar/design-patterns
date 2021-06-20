package patterns.behavioral.observer;

/**
 * Subject's contract
 * */
public interface Subject {
	
	void addObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
}
