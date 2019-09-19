package b.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo3ParamsTypeIference {

	public static void main(String[] args) {

		// method parameters type inferred from the interface method.

		Comparator<String> stringLengthComparator = (str1, str2) -> {
			int x1 = str1.length();
			int x2 = str2.length();
			int res = x1 == x2 ? 0 : x1 > x2 ? 1 : -1;
			return res;
		};

		// ===========================================================

		// using the above created comparator to sort strings by length
		List<String> list = Arrays.asList("bbb", "bbbb", "bb");
		System.out.println(list);
		Collections.sort(list, stringLengthComparator);
		System.out.println(list);

	}

}
