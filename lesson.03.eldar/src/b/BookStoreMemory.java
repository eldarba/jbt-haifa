package b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import a.Book;
import a.BookStore;

public class BookStoreMemory implements BookStore {
	// this is where we save the books of the system
	private List<Book> books = new ArrayList<>();

	@Override
	public void create(Book book) {
		books.add(book);
	}

	@Override
	public Book read(Book book) {
		for (Book currBook : books) {
			if (currBook != null && currBook.equals(book)) {
				return currBook;
			}
		}
		return null;
	}

	@Override
	public void update(Book book) {
		for (Book currBook : books) {
			if (currBook != null && currBook.equals(book)) {
				currBook.setAuthor(book.getAuthor());
				currBook.setPrice(book.getPrice());
				currBook.setTitle(book.getTitle());
				break;
			}
		}

	}

	@Override
	public void delete(Book book) {
		books.remove(book);
	}

	@Override
	public Collection<Book> readAll() {
		return books;
	}

}
