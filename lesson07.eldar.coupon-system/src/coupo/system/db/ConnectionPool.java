package coupo.system.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * this is a singleton class - only one instance of this class can be created
 * */
public class ConnectionPool {
	private Set<Connection> connections = new HashSet<>();
	private String url = "...";
	
	//1. create a private CTOR 
	//2. create a private static instance of this class
	//3. create public static method to obtain the instance
	
	//2
	private static ConnectionPool instance = new ConnectionPool();
	
	//1
	private ConnectionPool() {
		// add 10 connections to the set
		for (int i = 0; i < 10; i++) {
			try {
				connections.add(DriverManager.getConnection(url));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	//3
	public static ConnectionPool getInstance() {
		return instance;
	}
	
	
}
