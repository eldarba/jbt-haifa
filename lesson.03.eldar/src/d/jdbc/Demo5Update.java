package d.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5Update {

	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/dbBookStore";
		try (Connection con = DriverManager.getConnection(url)) {
			// CREATE sql insert
			String sql = "update books set price=12 where isbn=111";
			System.out.println(sql);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("data updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
