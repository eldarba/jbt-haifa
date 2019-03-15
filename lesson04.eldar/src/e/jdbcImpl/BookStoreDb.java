package e.jdbcImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

import c.book.Book;
import c.book.BookStore;

public class BookStoreDb implements BookStore {
	private String url = "jdbc:derby://localhost:1527/db1";

	@Override
	public void create(Book book) {
		try (Connection con = DriverManager.getConnection(url);) {
			Statement stmt = con.createStatement();
			String sql = "insert into books values(";
			sql += book.getIsbn() + ", ";
			sql += "'" + book.getTitle() + "', ";
			sql += "'" + book.getAuthor() + "', ";
			sql += book.getPrice() + ")";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Book read(Book book) {
		Book bookFromDb = new Book();
		try (Connection con = DriverManager.getConnection(url); Statement stmt = con.createStatement();) {
			String sql = "select * from books where isbn=" + book.getIsbn();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				bookFromDb.setIsbn(rs.getInt("isbn"));
				bookFromDb.setAuthor(rs.getString("author"));
				bookFromDb.setPrice(rs.getDouble("price"));
				bookFromDb.setTitle(rs.getString("title"));
				return bookFromDb;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update(Book book) {

	}

	@Override
	public void delete(Book book) {

	}

	@Override
	public Collection<Book> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
