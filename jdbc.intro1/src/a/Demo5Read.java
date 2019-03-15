package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5Read {

	// ResultSet - represents atable of data representing a database result set,

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db1";
		try (Connection con = DriverManager.getConnection(url + ";create=true");
				Statement stmt = con.createStatement();) {

			// READ
			String sqlPersonReadColumns = "select name, age from persons";
			String sqlPersonReadAllColumns = "select * from persons";
			String sqlPersonReadWhere = "select * from persons where age < 18";

			String sql = sqlPersonReadAllColumns;

			// ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(sql);

			ResultSetMetaData rsMeta = rs.getMetaData();
			System.out.println("table name: " + rsMeta.getTableName(1));
			while (rs.next()) {
				System.out.println("=== person ===");
				for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
					System.out.println(rsMeta.getColumnName(i) + ": " + rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
