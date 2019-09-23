package com.eldar.observers;

import com.eldar.subject.Subject;

public class ObserverImpl implements Observer {

	@Override
	public void eventHappendAt(Subject subject) {
		System.out.println(">>> event happend at: " + subject);
	}

}
