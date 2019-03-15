package c.io.text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {

		File file = new File("c:/temp/letter.txt");
		FileWriter out = null;
		try {
			out = new FileWriter(file, true);
			out.write("aaa bbb ccc");
			out.write("\r\n");
			// out.flush();

			System.out.println("data written");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
