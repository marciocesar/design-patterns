package patterns.behavioral.command;

/**
 * Concrete Command
 * */
public class StopCommand implements Command {
	
	private final Boolean rule;
	private final Car car;
	
	StopCommand(Boolean rule, Car car) {
		this.rule = rule;
		this.car = car;
	}
	
	@Override
	public void execute() {
		car.stop();
	}
	
	@Override
	public Boolean isExecute() {
		return rule;
	}
}
