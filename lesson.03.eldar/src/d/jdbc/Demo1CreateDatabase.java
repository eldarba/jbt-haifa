package d.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1CreateDatabase {
	/*
	 * 1. we need a DBMS - derby
	 * 
	 * 2. we need to know JDBC API - mostly interfaces
	 * 
	 * 3. we need JDBC implementations - from db vendor
	 * 
	 * 4. we need JDBC driver for the database
	 * 
	 * instructions:
	 * 
	 * 1. put apache derby directory in c:/java/servers
	 * 
	 * 2. start the DBMS db/bin/startNetworkServer.bat
	 * 
	 * 3. add derby jar file (db/lib/derbyclient.jar) to the project
	 * 
	 * 
	 */

	/* what to do in the main method */
	public static void main(String[] args) {
		// 1. define the new db url as String
		String dbUrl = "jdbc:derby:"; // protocol
		dbUrl += "//localhost:1527"; // machine ip + port
		dbUrl += "/dbBookStore"; // database name
		dbUrl += ";create=true"; // a command to create the db
		System.out.println(dbUrl);

		// 2. create a connection to the database
		// the connection is represented as java.sql.Connection
		// we get the connection object from DriverManager class
		try (Connection con = DriverManager.getConnection(dbUrl);) {
			System.out.println("connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected");

	}

}
