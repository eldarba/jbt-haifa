package a;

public class Demo1DriverLoading {

	public static void main(String[] args) {

		/*
		 * Driver loading is done automatically if the driver class is on the project
		 * class path.
		 * 
		 * When the driver class is not on the class path (for example in web
		 * environments) it is necessary to load the driver implicitly as shown in the
		 * example below.
		 */

		try {
			String driverName = "org.apache.derby.jdbc.ClientDriver";
			Class.forName(driverName);
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
