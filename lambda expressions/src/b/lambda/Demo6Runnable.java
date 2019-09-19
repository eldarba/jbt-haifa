package b.lambda;

public class Demo6Runnable {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t.start();
		System.out.println("end of maim");

	}

}
