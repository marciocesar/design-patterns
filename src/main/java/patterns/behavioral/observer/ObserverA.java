package patterns.behavioral.observer;


/**
 * This class is reactive the a event
 * */
public class ObserverA implements Observer {
	
	@Override
	public void update() {
		System.out.println("Event activated the class: "+this.getClass().getName());
	}
}
