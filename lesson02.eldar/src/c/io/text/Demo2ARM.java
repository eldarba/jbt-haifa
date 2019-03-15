package c.io.text;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2ARM {

	// ARM: Auto Resource Management

	public static void main(String[] args) {
		// write text to file
		try (FileWriter out = new FileWriter("c:/temp/letter.txt", true)) {
			out.write("Hello file io");
			out.write("\r\n");
			System.out.println("data written");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
