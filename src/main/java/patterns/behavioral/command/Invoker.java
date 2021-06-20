package patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker - Class that store commanders and make the request to execute their respective commander
 */
public class Invoker {
	
	private final List<Command> commands;
	
	public Invoker() {
		commands = new ArrayList<>();
	}
	
	public void addCommander(Command command) {
		commands.add(command);
	}
	
	public void executeCommander() {
		commands.stream()
		        .filter(Command::isExecute)
		        .forEach(Command::execute);
	}
}
