package a;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Object key1 = new Object();
		Object key2 = new Object();

		Thread t1 = new DeadlockThread("t1", key1, key2);
		Thread t2 = new DeadlockThread("t2", key2, key1);
		t1.start();
		t2.start();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("press enter to quit");
			sc.nextLine();
			System.out.println("Bye");
			t1.stop();
		}
	}

}

class DeadlockThread extends Thread {
	private Object keyA;
	private Object keyB;

	public DeadlockThread(String name, Object keyA, Object keyB) {
		super(name);
		this.keyA = keyA;
		this.keyB = keyB;
	}

	@Override
	public void run() {
		System.out.println(">>>" + getName() + " started");
		synchronized (keyA) {
			System.out.println(">>>" + getName() + " took key: " + keyA);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(">>>" + getName() + " asking for key: " + keyB);
			synchronized (keyB) {
				System.out.println(">>>" + getName() + " took key: " + keyB);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(">>>" + getName() + " released key: " + keyB);
			}

		}
		System.out.println(">>>" + getName() + " released key: " + keyA);
	}
}
