package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

import a.Book;
import a.BookStore;

public class BookStoreDb implements BookStore {
	private String url = "jdbc:derby://localhost:1527/dbBookStore";

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
