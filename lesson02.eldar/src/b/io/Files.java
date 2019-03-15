package b.io;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {

		File directory = new File("c:/temp");
		System.out.println(directory.exists());

		File file = new File(directory, "letter.txt");
		System.out.println(file.exists());

		if (!directory.exists()) {
			directory.mkdirs();
			System.out.println(directory + " created");
		}

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println(file + " created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
