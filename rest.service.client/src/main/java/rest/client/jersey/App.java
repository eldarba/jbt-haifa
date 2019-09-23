package rest.client.jersey;

import java.util.List;

public class App {

	public static void main(String[] args) {

		System.out.println("start");

		BusinessDelegate delegate = new BusinessDelegate();
		// create
//		{
//			Person person = new Person("Yona", 36);
//			try {
//				Person p = delegate.createPerson(person);
//				System.out.println(p);
//			} catch (JsonProcessingException e) {
//				e.printStackTrace();
//			}
//		}

		// read all
		{
			List<Person> persons = delegate.readAllPerson();
			System.out.println(persons);
		}

		// read one
//		{
//			Person p = delegate.readPerson(2);
//			System.out.println(p);
//			System.out.println("end");
//		}

		// update
//		{
//			Person p = delegate.readPerson(2);
//			p.setName("Doron");
//			p.setAge(100);
//			try {
//				delegate.updatePerson(p);
//			} catch (JsonProcessingException e) {
//				e.printStackTrace();
//			}
//		}

		// delete
//		{
//			delegate.deletePerson(1);
//			System.out.println("deleted");
//		}

	}

}
