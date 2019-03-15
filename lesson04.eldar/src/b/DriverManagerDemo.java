package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerDemo {

	public static void main(String[] args) {
		// the url to the database
		String url = "jdbc:derby://localhost:1527/db1";

		try (Connection con = DriverManager.getConnection(url + ";create=true");) {
			System.out.println("connected to ==> " + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from ==> " + url);
	}

}
