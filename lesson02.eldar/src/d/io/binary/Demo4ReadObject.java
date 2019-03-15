package d.io.binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import a.exceptions.Person;

public class Demo4ReadObject {

	public static void main(String[] args) {
		File file = new File("c:/temp/person.obj");
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
			Person p = (Person) in.readObject();
			System.out.println(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
