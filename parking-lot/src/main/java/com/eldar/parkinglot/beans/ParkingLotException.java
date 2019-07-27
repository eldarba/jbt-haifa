package com.eldar.parkinglot.beans;

public class ParkingLotException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParkingLotException() {
		super();
	}

	public ParkingLotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ParkingLotException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParkingLotException(String message) {
		super(message);
	}

	public ParkingLotException(Throwable cause) {
		super(cause);
	}

}
