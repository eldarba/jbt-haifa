package a;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("press enter to quit");
			sc.nextLine();
			System.out.println("Bye");
		}
	}

}
