package patterns.structural.proxy;

/**
 * Instance of connection
 * */
public class Database implements Connection{
	
	@Override
	public void open() {
		System.out.println("Opening connection......");
	}
	
	@Override
	public void close() {
		System.out.println("Shutting Connection....");
	}
}
