package com.eldar;

import com.eldar.observers.ObserverImpl;
import com.eldar.subject.Subject;
import com.eldar.subject.SubjectImpl;

public class Application {

	public static void main(String[] args) {

		// create a subject
		Subject subject = new SubjectImpl();
		// register an observable to the above subject
		subject.addObserver(new ObserverImpl());
		// register another observable to the above subject using lambda
		subject.addObserver(sub -> {
			System.out.println(">>> from lambda lisener: " + sub);
		});

		// activate subject to fire an event
		subject.fireEvent();
	}
}
