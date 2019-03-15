package d.io.binary;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1Write {

	public static void main(String[] args) {
		// here are some binary data:
		// these are Java binary data
		byte x = 15; // 8 bit
		long y = 25; // 64 bit
		float z = 35.78F; // 32 bit
		File file = new File("c:/temp/data.jav");
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
			out.writeByte(x);
			out.writeLong(y);
			out.writeFloat(z);
			System.out.println("data written to " + file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
