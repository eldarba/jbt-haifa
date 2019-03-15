package d.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4Read {

	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/dbBookStore";
		try (Connection con = DriverManager.getConnection(url)) {
			// READ sql select
			String sql = "select * from books";
			System.out.println(sql);
			Statement stmt = con.createStatement();
			// ResultSet is the result of select
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + ", ");
				System.out.print(rs.getString(2) + ", ");
				System.out.print(rs.getString(3) + ", ");
				System.out.println(rs.getDouble(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
