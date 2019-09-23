package e.comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("bbbb", "aaaaaaaa", "cc");
		System.out.println(list);

		// sort the collection using a comparator as lambda expression
		Collections.sort(list, (s1, s2) -> s1.length() - s2.length());

		System.out.println(list);

		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		System.out.println(list);
	}
}
