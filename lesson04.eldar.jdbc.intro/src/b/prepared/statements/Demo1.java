package b.prepared.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db1";
		String sql = "insert into persons values(?,?,?)"; // SQL with parameters

		try (Connection con = DriverManager.getConnection(url)) {

			PreparedStatement pstmt = con.prepareStatement(sql);

			int id = 555;
			String name = "Anat";
			int age = 33;

			// set the parameters values
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);

			// after the parameters are set we can execute
			pstmt.executeUpdate();
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
