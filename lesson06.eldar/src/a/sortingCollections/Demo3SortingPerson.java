package a.sortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Person;
import classes.PersonAgeComparator;
import classes.PersonNameComparator;

public class Demo3SortingPerson {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();

		list.add(new Person(333, "ccc", 60));
		list.add(new Person(111, "bbb", 50));
		list.add(new Person(222, "aaa", 70));

		System.out.println(list);
		// the sort method accept comparable types only
		Collections.sort(list); // sort by natural order (id)
		System.out.println("natural order (id)");
		System.out.println(list);

		PersonNameComparator nameComparator = new PersonNameComparator();
		Collections.sort(list, nameComparator); // sort by other order (name)
		System.out.println("other order (name)");
		System.out.println(list);

		// sort by other order (age)
		PersonAgeComparator ageComparator = new PersonAgeComparator();
		Collections.sort(list, ageComparator);
		System.out.println("other order (age)");
		System.out.println(list);

	}

}
