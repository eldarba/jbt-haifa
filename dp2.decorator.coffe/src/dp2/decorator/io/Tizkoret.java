package dp2.decorator.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tizkoret {

	public static void main(String[] args) {
		try {
			// read text from file
			FileReader in1 = new FileReader("c:/temp/file1.txt");

			// read text from file + buffer
			BufferedReader in2 = new BufferedReader(new FileReader("c:/temp/file1.txt"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
