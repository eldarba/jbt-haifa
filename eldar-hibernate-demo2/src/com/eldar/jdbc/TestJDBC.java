package com.eldar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1?useSSL=false&serverTimezone=UTC";
		String user = "eldar1";
		String password = "pass1";

		try (Connection con = DriverManager.getConnection(url, user, password)) {
			System.out.println("connected to: " + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from: " + url);

	}

}
