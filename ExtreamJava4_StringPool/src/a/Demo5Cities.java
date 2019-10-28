package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo5Cities {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			System.out.print("enter city: ");
			cities.add(sc.nextLine());
		}
		sc.close();
		System.out.println(cities);
	}

}
