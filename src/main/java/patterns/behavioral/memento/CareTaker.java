package patterns.behavioral.memento;

import java.util.LinkedList;

/**
 * CareTaker - Class that manage the states of a Originator
 * works as a store, yet not change a memento
 */
public class CareTaker {
	
	private final Originator originator;
	private LinkedList<Memento> mementos;
	
	CareTaker(Originator originator) {
		this.originator = originator;
	}
	
	void backup() {
		
		//backup of a current state from Originator
		
		mementos.add(originator.save());
	}
	
	void undo() {
		
		//get the last state stored and give to Originator for might be restored
		
		if (mementos.size() == 0) {
			return;
		}
		
		final Memento memento = mementos.removeLast();
		
		originator.restore(memento);
	}
	
	void showHistory() {
		
		mementos.stream()
		        .map(Memento::getDate)
		        .forEach(System.out::println);
	}
}
