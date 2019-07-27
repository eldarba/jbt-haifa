package com.eldar.parkinglot.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ParkingLot {

	public static final int MAX_CAPACITY = 3;
	private List<Car> cars = new ArrayList<>();

	public boolean isFull() {
		return cars.size() == MAX_CAPACITY;
	}

	/**
	 * Put a car in the parking lot.
	 * 
	 * @param car The car to park in the parking lot.
	 * 
	 * @throws ParkingLotException if the parking lot is full.
	 */
	public void parkIn(Car car) throws ParkingLotException {
		if (!isFull()) {
			cars.add(car);
		} else {
			throw new ParkingLotException("parking a car failed - the parking lot is full");
		}
	}

	/**
	 * Get a car out of the parking lot.
	 * 
	 * @param carNumber The number of the car to get out of the parking lot.
	 * 
	 * @return The specified car or null if not found.
	 */
	public Car parkOut(int carNumber) {
		int index = cars.indexOf(new Car(carNumber));
		if (index != -1) {
			return cars.remove(index);
		}
		return null;
	}

	public List<Car> getCars() {
		return cars;
	}

}
