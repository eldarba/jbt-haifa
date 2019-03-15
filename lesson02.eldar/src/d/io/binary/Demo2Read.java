package d.io.binary;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2Read {

	public static void main(String[] args) {
		File file = new File("c:/temp/data.jav");
		try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
			byte a = in.readByte();
			long b = in.readLong();
			float c = in.readFloat();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
