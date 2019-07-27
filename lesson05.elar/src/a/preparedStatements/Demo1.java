package a.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo1 {
	
	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/db1";
		String sql = "insert into person values(?, ?, ?)";
		try(Connection con = DriverManager.getConnection(url);) {
			// create the prepared statement
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set the parameters (?,?,?)
			pstmt.setInt(1, 101);
			pstmt.setString(2, "Dan");
			pstmt.setInt(3, 25);
			// execute the command on the db
			pstmt.executeUpdate();
			System.out.println("done");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
