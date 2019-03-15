package b.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		List<String> list; // reference to a list

		list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);

		list = new LinkedList<>(list);

		Set<String> set = new LinkedHashSet<>(list);
		System.out.println(set);

	}
}
