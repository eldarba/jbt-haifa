package d;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Employee();
		Employee p2 = (Employee) p1;
		System.out.println(p1.id);
		System.out.println(p2.id);
	}
}
