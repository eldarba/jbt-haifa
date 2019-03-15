package d.io.binary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import a.exceptions.Person;

public class Demo3WriteObject {

	public static void main(String[] args) {
		File file = new File("c:/temp/person.obj");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
			Person p = new Person();
			p.setId(111);
			p.setName("Dan");
			p.setAge(22);
			out.writeObject(p);
			System.out.println(p + " wriiten to " + file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
