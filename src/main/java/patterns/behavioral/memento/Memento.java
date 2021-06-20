package patterns.behavioral.memento;

import java.time.LocalDateTime;

/**
 * Abstract memento
 * */
public interface Memento {
	
	LocalDateTime getDate();
	
	Integer getState();
}
