package rest.client.jersey;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

// business delegate - this class is client code (using an external web service)
public class BusinessDelegate {

//	private ClientConfig clientConfig = new ClientConfig();
//	private Client client = ClientBuilder.newClient(clientConfig);
	private Client client = ClientBuilder.newClient();
	private WebTarget webTarget = client.target("http://localhost:8080/api/");
	// private ObjectMapper objectMapper = new ObjectMapper();

	/** create a new person */
	public Person createPerson(Person person) {
//		String str = objectMapper.writeValueAsString(person);
//		Entity<String> personAsJson = Entity.json(str);
		Entity<Person> personEntity = Entity.json(person);
		Builder requestBuilder = webTarget.path("person").request();
//		Response response = requestBuilder.post(personAsJson);
		Response response = requestBuilder.post(personEntity);
		if (response.getStatusInfo().toEnum() == Response.Status.OK) {
			person = response.readEntity(Person.class);
			return person;
		} else {
			int statusCode = response.getStatus();
			String reason = response.getStatusInfo().getReasonPhrase();
			throw new RuntimeException("createPerson " + person + " failed: " + statusCode + ": " + reason);
		}
	}

	/** read person of specified id. returns null if not exist */
	public Person readPerson(int id) {
//		Builder requestBuilder = webTarget.path("person/" + id).request(MediaType.APPLICATION_JSON);
		Builder requestBuilder = webTarget.path("person/" + id).request();
//		Response response = requestBuilder.get(Response.class);
		Response response = requestBuilder.get();
		if (response.getStatusInfo().toEnum() == Response.Status.OK) {
//			GenericType<Person> type = new GenericType<Person>() {
//			};
//			Person person = response.readEntity(type);
			Person person = response.readEntity(Person.class);
			return person;
		} else {
			int statusCode = response.getStatus();
			String reason = response.getStatusInfo().getReasonPhrase();
			throw new RuntimeException("readPerson id " + id + " failed: " + statusCode + ": " + reason);
		}
	}

	/** read all persons */
	public List<Person> readAllPerson() {
		Builder requestBuilder = webTarget.path("person-all").request();
//		Response response = requestBuilder.get(Response.class);
		Response response = requestBuilder.get();
		GenericType<List<Person>> listType = new GenericType<List<Person>>() {
		};
		List<Person> list = response.readEntity(listType);
		return list;
	}

	/**
	 * Update the specified person. If the person specified not exit create it as a
	 * new person
	 */
	public Person updatePerson(Person person) {
		Entity<Person> personEntity = Entity.json(person);
		Builder requestBuilder = webTarget.path("person").request();
		Response response = requestBuilder.put(personEntity);
		if (response.getStatusInfo().toEnum() == Response.Status.OK) {
			person = response.readEntity(Person.class);
			return person;
		} else {
			int statusCode = response.getStatus();
			String reason = response.getStatusInfo().getReasonPhrase();
			throw new RuntimeException("updatePerson " + person + " failed: " + statusCode + ": " + reason);
		}
	}

	/**
	 * Delete the person of the specified id and returns the deleted person. if
	 * person not found returns null
	 */
	public Person deletePerson(int id) {
		Builder requestBuilder = webTarget.path("person/" + id).request();
		Person person = readPerson(id);
		Response response = requestBuilder.delete();
		if (response.getStatusInfo().toEnum() == Response.Status.OK) {
			return person;
		} else {
			int statusCode = response.getStatus();
			String reason = response.getStatusInfo().getReasonPhrase();
			throw new RuntimeException("deletePerson id: " + id + " failed: " + statusCode + ": " + reason);
		}
	}

}
