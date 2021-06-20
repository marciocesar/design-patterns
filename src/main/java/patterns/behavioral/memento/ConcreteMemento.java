package patterns.behavioral.memento;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

/**
 * Concrete memento - Class responsibly to store a current memento
 * */
public class ConcreteMemento implements Memento {
	
	private final Integer state;
	private final LocalDateTime date;
	
	ConcreteMemento(Integer state) {
		
		this.state = state;
		this.date = now();
	}
	
	@Override
	public LocalDateTime getDate() {
		return date;
	}
	
	@Override
	public Integer getState() {
		return state;
	}
}
