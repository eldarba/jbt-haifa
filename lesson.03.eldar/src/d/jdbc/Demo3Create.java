package d.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Create {

	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/dbBookStore";
		try (Connection con = DriverManager.getConnection(url)) {
			// CREATE sql insert
			String sql = "insert into books values";
			sql += "(222, 'java 2', 'amid', 52.36)";
			System.out.println(sql);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("data inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
