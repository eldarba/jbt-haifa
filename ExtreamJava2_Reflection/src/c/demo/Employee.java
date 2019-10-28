package c.demo;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee> {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
	}

	public boolean performTask(String description) {
		System.out.println("performTask: " + description);
		return true;
	}

	public boolean performTask(String description, int times) {
		for (int i = 0; i < times; i++) {
			performTask(description);
		}
		return false;
	}

	public void postRequest(int requestId, String requestType, String request) {
		System.out.println("\nPosting a request ...");
		System.out.println("requestId: " + requestId);
		System.out.println("requestType: " + requestType);
		System.out.println("request: " + request);
		System.out.println("Approved?: YES");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee other) {
		return this.id - other.id;
	}

}
