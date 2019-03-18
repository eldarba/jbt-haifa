package a.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/db1";
		String sql = "insert into person values(?, ?, ?)";
		try (Connection con = DriverManager.getConnection(url);) {
			// create the prepared statement
			PreparedStatement pstmt = con.prepareStatement(sql);
			for (int i = 120; i <= 130; i++) {
				// set the parameters (?,?,?)
				pstmt.setInt(1, i);
				pstmt.setString(2, "name" + i);
				pstmt.setInt(3, (int) (Math.random() * 121));
				// execute the command on the db
				pstmt.executeUpdate();
				System.out.println("done");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
