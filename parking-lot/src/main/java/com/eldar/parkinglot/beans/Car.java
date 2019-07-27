package com.eldar.parkinglot.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {

	private int number;
	private String driverName;

	public Car(int number, String driverName) {
		super();
		this.number = number;
		this.driverName = driverName;
	}

	public Car() {
		super();
	}

	public Car(int carNumber) {
		this.number = carNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return "[car number: " + number + ", driver: " + driverName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (number != other.number)
			return false;
		return true;
	}

}
