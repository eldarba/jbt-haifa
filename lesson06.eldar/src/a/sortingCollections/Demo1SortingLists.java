package a.sortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1SortingLists {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(1); // will be added in a list - duplication
		System.out.println(list);
		Collections.sort(list); // sorting the list
		System.out.println(list);
	}

}
