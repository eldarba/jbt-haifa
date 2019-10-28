package a;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		readBook();

		System.gc();
		Thread.sleep(1000);
		System.out.println("end");
	}

	public static void readBook() {
		Book b = new Book();
		b.read();
	}

}

class Book {

	@Override
	protected void finalize() throws Throwable {
		System.out.println(">>> Book.finalize()");
	}

	public void read() {
		System.out.println("read the book");
	}
}