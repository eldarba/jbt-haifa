package com.eldar.subject;

import com.eldar.observers.Observer;

public interface Subject {

	void addObserver(Observer observer);

	void fireEvent();

}
