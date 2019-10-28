package z.tar01;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(Car.MAX_SPEED);
		Car c1 = new Car(101);
		System.out.println(c1);
		c1.start();
		c1.setSpeed(100);
		c1.stop();

	}

}
