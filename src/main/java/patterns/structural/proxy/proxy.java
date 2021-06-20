package patterns.structural.proxy;

/**
 * Wrapper that take necessary measures to something happen
 * */
public class proxy implements Connection {
	
	private final Database dataBase;
	
	proxy() {
		dataBase = new Database();
	}
	
	@Override
	public void open() {
		preparingToOpen();
		dataBase.open();
	}
	
	@Override
	public void close() {
		preparingToShut();
		dataBase.close();
	}
	
	private void preparingToOpen() {
		System.out.println("Preparing to open connection with Proxy....");
	}
	
	private void preparingToShut() {
		System.out.println("Preparing to shut connection with proxy....");
	}
}
