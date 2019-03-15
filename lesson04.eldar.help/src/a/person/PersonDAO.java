package a.person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DAO - Data Access Object
public class PersonDAO {

	private String url = "jdbc:derby://localhost:1527/db1";

	/* how to create a person in the database from a person object */

	public void createPerson(Person person) {
		String sql = "insert into person values(";
		sql += person.getId() + ", ";
		sql += "'" + person.getName() + "', ";
		sql += person.getAge() + ")";

		try (Connection con = DriverManager.getConnection(url); Statement stmt = con.createStatement();) {
			stmt.executeUpdate(sql); // put the person in the db
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Person readPerson(int personId) {
		String sql = "select * from person where id = " + personId;
		try (Connection con = DriverManager.getConnection(url); Statement stmt = con.createStatement();) {
			ResultSet rs = stmt.executeQuery(sql); // get the person from the db
			if (rs.next()) {
				Person person = new Person(personId);
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				return person;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
