package a.person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseBuilder {

	public static void main(String[] args) {

		String sqlCreatePersonTable = "create table person";
		sqlCreatePersonTable += "(";
		sqlCreatePersonTable += "id int primary key, ";
		sqlCreatePersonTable += "name varchar(20), ";
		sqlCreatePersonTable += "age int";
		sqlCreatePersonTable += ")";

		String url = "jdbc:derby://localhost:1527/db1";
		try (Connection con = DriverManager.getConnection(url); Statement stmt = con.createStatement();) {
			// stmt.executeUpdate(sqlCreatePersonTable);
			// System.out.println(sqlCreatePersonTable);
			System.out.println(stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
