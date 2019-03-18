package a.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Demo3Targil {
	/** get id as input and show person full details */
	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/db1";
		String sql = "SELECT * FROM person WHERE id=?";
		try (Connection con = DriverManager.getConnection(url);) {
			// create the prepared statement
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ask for user input
			int id = Integer.parseInt(JOptionPane.showInputDialog("enter id"));
			System.out.println("you asked for person with id: " + id);
			// set the ? parameter
			pstmt.setInt(1, id);
			// execute the SQL command and get the result set
			ResultSet rs = pstmt.executeQuery();
			// show the person details if found
			if (rs.next()) { // person found
				System.out.println("name: " + rs.getString("name"));
				System.out.println("age: " + rs.getInt("age"));
			} else { // person not found
				System.out.println("person with id " + id + " not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
