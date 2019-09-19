package b.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo4oneLineImpl {

	public static void main(String[] args) {

		// if the implementation is of 1 line you can ommit the body and the return
		// keyword:

		Comparator<String> stringLengthComparator = (str1, str2) -> str1.compareTo(str2);

		// ===========================================================

		// using the above created comparator to sort strings by length
		List<String> list = Arrays.asList("bbb", "bbbb", "bb");
		System.out.println(list);
		Collections.sort(list, stringLengthComparator);
		System.out.println(list);

	}

}
