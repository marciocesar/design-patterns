package patterns.behavioral.memento;

import lombok.Setter;

import java.util.Random;

/**
 * Originator - class that has a state
 */
@Setter
public class Originator {
	
	private int state;
	
	Originator() {
		this.state = new Random().nextInt();
	}
	
	Memento save() {
		
		//save state in a memento
		
		return new ConcreteMemento(state);
	}
	
	void restore(final Memento memento) {
		
		//restoring state from a memento
		
		setState(memento.getState());
	}
	
	void doSomething() {
		
		//do something important, and change state
		
		state = new Random().nextInt();
	}
	
}
