package z.tar01;

public class Engine {

	public static final int MIN_RPM = 270;
	public static final int MAX_RPM = 5_300;

	private int rpm;
	private boolean started;
	static {
		System.out.println(">>> Engine class initialized");
	}

	public Engine() {
		super();
	}

	public Engine(boolean started) {
		super();
		start();
	}

	public void start() {
		System.out.println("starting the engine");
		started = true;
		setRpm(MIN_RPM);
	}

	public void stop() {
		System.out.println("stopping the engine");
		this.rpm = 0;
		started = false;
	}

	public int getRpm() {
		return rpm;
	}

	public boolean setRpm(int rpm) {
		if (started && validateRpm(rpm)) {
			this.rpm = rpm;
			return true;
		} else {
			System.out.println("to high RPM: " + rpm);
			return false;
		}
	}

	private boolean validateRpm(int rpm) {
		return rpm >= MIN_RPM && rpm <= MAX_RPM;
	}

	public boolean isStarted() {
		return started;
	}

	@Override
	public String toString() {
		return "Engine [rpm=" + rpm + ", started=" + started + "]";
	}

}
