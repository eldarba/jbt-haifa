package classes;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int a = p1.getAge();
		int b = p2.getAge();
		return a < b ? -1 : a > b ? 1 : 0;
	}

}
