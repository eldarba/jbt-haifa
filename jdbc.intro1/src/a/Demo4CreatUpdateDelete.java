package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4CreatUpdateDelete {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db1";
		try (Connection con = DriverManager.getConnection(url + ";create=true");
				Statement stmt = con.createStatement();) {

			// CREATE
			String sqlPersonCreate = "insert into persons(id, name, age) values(101, 'Ron', 35)";
			// UPDATE
			String sqlPersonUpdate = "update persons set age=0";
			String sqlPersonUpdateWhere = "update persons set age=36 where name='Dan'";
			// DELETE
			String sqlPersonDelete = "delete from persons";
			String sqlPersonDeleteWhere = "delete from persons where id=101";

			String sql = sqlPersonCreate;
			stmt.executeUpdate(sql);

			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
