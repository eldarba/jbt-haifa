package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5ReadSimple {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db1";
		try ( // ARM resources:

				Connection con = DriverManager.getConnection(url);

				Statement stmt = con.createStatement();

				ResultSet rs = stmt.executeQuery("select * from persons");

		) {

			// go over the result set
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
