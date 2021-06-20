package patterns.behavioral.command;

/**
 * Receive Concrete
 * */
public class Beetle implements Car {
	
	@Override
	public void run() {
		System.out.println("Beetle Running...");
	}
	
	@Override
	public void stop() {
		System.out.println("Beetle Stopping...");
	}
}
