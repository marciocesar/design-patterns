package patterns.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * This class implements is responsible to notify the observers about some event
 */
public class ConcreteSubject implements Subject {
	
	List<Observer> observers;
	
	ConcreteSubject() {
		this.observers = new LinkedList<>();
	}
	
	@Override
	public void addObserver(final Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void removeObserver(final Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		observers.forEach(Observer::update);
	}
	
	public void someNegotialLogical() {
		
		System.out.println("Some negotial Logical being executed....");
		
		notifyObservers();
	}
}
