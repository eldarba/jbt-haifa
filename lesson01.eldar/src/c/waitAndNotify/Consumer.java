package c.waitAndNotify;

public class Consumer extends Thread {

	private Stack stack;

	public Consumer(Stack stack, String name) {
		super(name);
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			int r = stack.pop();
			System.out.println(getName() + " popped " + r);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
