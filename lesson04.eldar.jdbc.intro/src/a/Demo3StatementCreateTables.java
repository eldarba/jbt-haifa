package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3StatementCreateTables {

	public static void main(String[] args) {
		/*
		 * Statement - is the object with which we send SQL requests to a database.
		 * 
		 * We use the Connection to get a statement, as shown below:
		 */

		String url = "jdbc:derby://localhost:1527/db1";
		try (

				Connection con = DriverManager.getConnection(url + ";create=true");
				// We use the Connection to get a statement:
				Statement stmt = con.createStatement();

		) {

			// an SQL statement for creating a table:
			String sqlCreateTable = "create table persons(id int, name varchar(10), age int)";
			String sqlDropTable = "drop table persons";
			String sqlCreateTablePK = "create table persons(id int primary key, name varchar(10), age int)";

			String sql = sqlCreateTablePK;
			// executing the statement on the database:
			stmt.executeUpdate(sql);

			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
