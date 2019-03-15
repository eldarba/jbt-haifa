package a;

public enum Planet {

	// constants
	EARTH(44, 55), MARS(66, 77), JUPITER(105, 200);

	// attributes
	private int orbit;
	private int mass;

	// CTOR
	private Planet(int orbit, int mass) {
		this.orbit = orbit;
		this.mass = mass;
	}

	// methods
	public int getOrbit() {
		return orbit;
	}

	public void setOrbit(int orbit) {
		this.orbit = orbit;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

}
