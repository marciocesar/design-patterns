package patterns.creational.factory;

public class XboxJoystick extends Joystick {
	
	@Override
	public void switchedOn() {
		System.out.println("Xbox joystick switched on");
	}
	
	@Override
	public void switchedOff() {
		System.out.println("Xbox joystick switched off");
	}
	
	@Override
	public void extractDescription() {
	
	}
}
