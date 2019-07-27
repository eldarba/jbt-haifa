package classes;

import java.util.Comparator;

//Comparator defines other order - outside the class
public class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// we can use the natural order of String
		return p1.getName().compareTo(p2.getName());
	}

}
