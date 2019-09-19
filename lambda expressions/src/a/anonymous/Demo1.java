package a.anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		// creating a Comparator<String> object using anonymous inner class to implement

		Comparator<String> stringLengthComparator = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				int x1 = str1.length();
				int x2 = str2.length();
				int res = x1 == x2 ? 0 : x1 > x2 ? 1 : -1;
				return res;
			}
		};

		// ===========================================================

		// using the above created comparator to sort strings by length
		List<String> list = Arrays.asList("aaa", "aaaa", "aa");
		System.out.println(list);
		Collections.sort(list, stringLengthComparator);
		System.out.println(list);

	}

}
