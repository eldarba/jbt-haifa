package com.eldar.subject;

import java.util.ArrayList;
import java.util.List;

import com.eldar.observers.Observer;

public class SubjectImpl implements Subject {

	/**
	 * this is a collection of all observers / listeners registered to this subject
	 */
	private List<Observer> observers = new ArrayList<>();

	/** add an observer to this subject */
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	/** fire an event to activate the observers */
	@Override
	public void fireEvent() {
		for (Observer observer : observers) {
			if (observer != null) {
				observer.eventHappendAt(this);
			}
		}

	}

}
