package dp2.decorator.cofee;

public abstract class Beverage {

	protected String description = "Unknown beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
