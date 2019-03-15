package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2Connection {

	public static void main(String[] args) {
		/*
		 * DriverManager - is the basic service for managing a set of JDBC drivers.
		 * 
		 * Connection - is the basic object from which we operate on a specific
		 * database.
		 * 
		 * We use the DriverManager to get a connection to a database, as shown below:
		 */

		String url = "jdbc:derby://localhost:1527/db1";
		try (Connection con = DriverManager.getConnection(url + ";create=true");) {
			System.out.println("connected to ===>" + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from ===>" + url);
	}

}
