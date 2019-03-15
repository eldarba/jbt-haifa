package a;

public class JDBCDriverLoad {

	public static void main(String[] args) {

		String driverName = "org.apache.derby.jdbc.ClientDriver";
		try {
			Class.forName(driverName); // driver class will load
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
