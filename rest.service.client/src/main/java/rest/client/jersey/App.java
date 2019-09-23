package rest.client.jersey;

public class App {

	public static void main(String[] args) {

		System.out.println("start");

		BusinessDelegate delegate = new BusinessDelegate();
//		Person person = new Person("Moshe", 25);
//		try {
//			Person p = delegate.createPerson(person);
//			System.out.println(p);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}

//		List<Person> persons = delegate.readAllPerson();
//		System.out.println(persons);
//
		Person p = delegate.readPerson(2);
		System.out.println(p);
		System.out.println("end");
	}

}
