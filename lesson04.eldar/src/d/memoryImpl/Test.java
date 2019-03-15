package d.memoryImpl;

import c.book.Book;
import c.book.BookStore;

public class Test {

	public static void main(String[] args) {
		// create a store
		BookStore store = new BookStoreMemory();
		// add 3 books
		store.create(new Book(111, "Java 1", "Eldar", 100));
		store.create(new Book(222, "Java 2", "Amid", 150));
		store.create(new Book(333, "Java 3", "Eldar", 25));
		// show all books in the store
		System.out.println(store.readAll());
		// show book 333
		System.out.println(store.read(new Book(333)));
		// update book 333 - price is now 500
		Book b = store.read(new Book(333));
		b.setPrice(500);
		store.update(b);
		// show book 333
		System.out.println(store.read(new Book(333)));

	}

}
