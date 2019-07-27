package coupo.system.db;

public class Test {
	
	public static void main(String[] args) {
		// this is how we get an instance of a singleton
		ConnectionPool cp = ConnectionPool.getInstance();
	}

}
