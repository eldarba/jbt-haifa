package z.tar01;

public class Car {

	public static final int MAX_SPEED = 180;
	public static final int MIN_SPEED = 0;

	private int id;
	private int speed;
	private boolean started;
	private Engine engine = new Engine();

	static {
		System.out.println(">>> Car class initialized");
	}

	public Car(int id) {
		super();
		this.id = id;
	}

	public void start() {
		System.out.println("starting the car");
		engine.start();
		started = true;
		System.out.println(this);
	}

	public void stop() {
		System.out.println("stopping the car");
		engine.stop();
		speed = 0;
		started = false;
		System.out.println(this);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (this.started && speed >= MIN_SPEED && speed <= MAX_SPEED) {
			System.out.println("setting the car speed");
			if (engine.setRpm(speed * 10 + Engine.MIN_RPM)) {
				this.speed = speed;
				System.out.println(this);
			} else {
				System.out.println("setSpeed failed");
			}

		}
	}

	public int getId() {
		return id;
	}

	public boolean isStarted() {
		return started;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", speed=" + speed + ", started=" + started + ", engine=" + engine + "]";
	}

}
