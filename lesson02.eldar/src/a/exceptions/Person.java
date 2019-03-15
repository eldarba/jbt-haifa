package a.exceptions;

import java.io.Serializable;

public class Person implements Serializable {

	private int id;
	private String name;
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age >= 0 && age <= 120) {
			this.age = age;
			return; // all is good
		} else {
			Exception e = new Exception(age + " is an illegal age value");
			throw e; // something is wrong
		}
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
