package c.book;

import java.util.Collection;

/*
 * author: Eldar
 * date: 11/3/2019
 * */
public interface BookStore {

	// CRUD - Create, Read, Update, Delete
	/**
	 * create the specified book in the system.
	 * 
	 * @param book
	 *            a book instance with all attributes initialized.
	 */
	void create(Book book);

	/**
	 * read the specified book from the system.
	 * 
	 * @param book
	 *            a book instance with the isbn initialized.
	 * @return a book instance with all attributes initialized or null if not found.
	 */
	Book read(Book book);

	/**
	 * update the specified book in the system according to the book parameter.
	 * 
	 * @param book
	 *            a book instance with all attributes initialized.
	 */
	void update(Book book);

	/**
	 * delete the specified book (by isbn) from the system.
	 * 
	 * @param book
	 *            a book instance with isbn initialized.
	 */
	void delete(Book book);

	/**
	 * read all books from the system
	 * 
	 * @return a collection of all system books
	 */
	Collection<Book> readAll();

}
