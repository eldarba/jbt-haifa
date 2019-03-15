package a.exceptions;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		try {
			p1.setAge(25);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p1);
	}
}
