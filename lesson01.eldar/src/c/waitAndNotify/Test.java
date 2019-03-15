package c.waitAndNotify;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Stack stack = new Stack();
		Producer p1 = new Producer(stack, "p1");
		Consumer c1 = new Consumer(stack, "c1");
		p1.start();

		Thread.sleep(2000);
		c1.start();

	}

}
