package patterns.behavioral.observer;

public class Main {
	
	public static void main(String[] args) {
		
		final ConcreteSubject subject = new ConcreteSubject();
		
		subject.addObserver(new ObserverA());
		subject.addObserver(new ObserverB());
		subject.addObserver(new ObserverC());
		
		subject.someNegotialLogical();
	}
}
