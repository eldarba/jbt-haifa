package a;

public class App {

	public static void main(String[] args) {
		Planet p = Planet.JUPITER;
		System.out.println("planet: " + p);
		System.out.println("mass: " + p.getMass());
		System.out.println("orbit: " + p.getOrbit());

	}

}
