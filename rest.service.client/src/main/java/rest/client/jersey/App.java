package rest.client.jersey;

public class App {

	public static void main(String[] args) {

		System.out.println("start");

//		BusinessDelegate delegate = new BusinessDelegate();
		BusinessDelegateShortVersion delegate = new BusinessDelegateShortVersion();
		// create
//		{
//			Person person = new Person("John", 50);
//			Person p = delegate.createPerson(person);
//			System.out.println(p);
//		}

		// read all
//		{
//			java.util.List<Person> persons = delegate.readAllPerson();
//			for (Person person : persons) {
//				System.out.println(person);
//			}
//		}

		// read one
//		{
//			Person p = delegate.readPerson(8);
//			System.out.println(p);
//		}

		// update
//		{
//			Person p = new Person(8, "Shaul", 72);
//			System.out.println(p);
//			delegate.updatePerson(p);
//		}

		// delete
		{
			int id = 9;
			Person p = delegate.deletePerson(id);
			if (p != null) {
				System.out.println("deleted person " + id + ": " + p);
			} else {
				System.out.println("did not deleted person " + id + ": not found: " + p);
			}
		}

		System.out.println("end");
	}

}
