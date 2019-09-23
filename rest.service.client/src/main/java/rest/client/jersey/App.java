package rest.client.jersey;

import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("start");
		ClientController controller = new ClientController();
//		Person person = new Person(0, "bbb", 33);
//		try {
//			controller.createPerson(person);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}

		List<Person> persons = controller.readAllPerson();
		System.out.println(persons);

		Person person = controller.readPerson(1);
		System.out.println(person);
		System.out.println("end");
	}

}
