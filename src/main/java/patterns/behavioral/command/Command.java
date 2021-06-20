package patterns.behavioral.command;

/**
 * Commander contract
 * */
public interface Command {
	
	void execute();
	
	Boolean isExecute();
}
