package a.person;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		PersonDAO dao = new PersonDAO();

		dao.createPerson(new Person(111, "aaa", 22));
		dao.createPerson(new Person(222, "aaa", 22));
		dao.createPerson(new Person(333, "aaa", 22));

		int id = Integer.parseInt(JOptionPane.showInputDialog("enter id"));
		System.out.println(id);

		Person p = dao.readPerson(id);
		System.out.println(p);
	}
}
