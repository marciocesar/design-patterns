package patterns.behavioral.command;

/**
 * Concrete Command
 * */
public class RunCommand implements Command {
	
	private final Car car;
	private Boolean rule;
	
	RunCommand(Boolean rule, Car car) {
		this.rule = rule;
		this.car = car;
	}
	
	@Override
	public void execute() {
		car.run();
	}
	
	@Override
	public Boolean isExecute() {
		return rule;
	}
}
