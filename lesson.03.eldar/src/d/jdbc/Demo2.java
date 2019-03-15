package d.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {
		// ij
		// connect 'jdbc:derby://localhost:1527/dbBookStore';
		String url = "jdbc:derby://localhost:1527/dbBookStore";
		try (Connection con = DriverManager.getConnection(url)) {
			// execute some sql commands:
			// to run sql commands in java we need a Statement object
			String sql = "create table books(";
			sql += "isbn int, ";
			sql += "title varchar(10), ";
			sql += "author varchar(10), ";
			sql += "price float";
			sql += ")";
			System.out.println(sql);
			// we get a statement object from the connection
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("table created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
