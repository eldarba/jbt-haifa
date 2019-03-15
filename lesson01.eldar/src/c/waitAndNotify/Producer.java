package c.waitAndNotify;

public class Producer extends Thread {

	private Stack stack;

	public Producer(Stack stack, String name) {
		super(name);
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			int r = (int) (Math.random() * 101);
			stack.push(r);
			System.out.println(getName() + " pushed " + r);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
