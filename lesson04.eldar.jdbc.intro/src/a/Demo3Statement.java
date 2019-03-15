package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Statement {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db1";
		try (

				Connection con = DriverManager.getConnection(url + ";create=true");
				Statement stmt = con.createStatement();

		) {

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
