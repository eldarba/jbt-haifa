package c;

import java.io.Serializable;
import java.util.Arrays;

public class ClassObjectMethods {

	public static void main(String[] args) {
		Person p = new Person(101, "aaa");
		System.out.println(p.getClass().getName());
		System.out.println(p.getClass().getSuperclass());
		System.out.println(p.getClass().isInterface());
		System.out.println(Arrays.toString(p.getClass().getInterfaces()));
		System.out.println(p.getClass().getClassLoader());
	}

}

/**
 * @author eldar
 *
 */
class Person implements Serializable, Talker {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

interface Talker {

}
