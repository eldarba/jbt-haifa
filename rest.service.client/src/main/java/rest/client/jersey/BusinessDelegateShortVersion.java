package rest.client.jersey;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class BusinessDelegateShortVersion {

	private Client client = ClientBuilder.newClient();
	private WebTarget webTarget = client.target("http://localhost:8080/api/");

	/** create a new person */
	public Person createPerson(Person person) {
		Response response = webTarget.path("person").request().post(Entity.json(person));
		if (response.getStatusInfo().toEnum() == Response.Status.OK) {
			return response.readEntity(Person.class);
		} else {
			int statusCode = response.getStatus();
			String reason = response.getStatusInfo().getReasonPhrase();
			throw new RuntimeException("createPerson " + person + " failed: " + statusCode + ": " + reason);
		}
	}

	/** read person of specified id. returns null if not exist */
	public Person readPerson(int id) {
		Response response = webTarget.path("person/" + id).request().get();
		if (response.getStatusInfo().toEnum() == Response.Status.OK) {
			return response.readEntity(Person.class);
		} else {
			int statusCode = response.getStatus();
			String reason = response.getStatusInfo().getReasonPhrase();
			throw new RuntimeException("readPerson id " + id + " failed: " + statusCode + ": " + reason);
		}
	}

	/** read all persons */
	public List<Person> readAllPerson() {
		Response response = webTarget.path("person-all").request().get();
		if (response.getStatusInfo().toEnum() == Response.Status.OK) {
			return response.readEntity(new GenericType<List<Person>>() {
			});
		} else {
			int statusCode = response.getStatus();
			String reason = response.getStatusInfo().getReasonPhrase();
			throw new RuntimeException("readAllPerson failed: " + statusCode + ": " + reason);
		}
	}

	/**
	 * Update the specified person. If the person specified not exit create it as a
	 * new person
	 */
	public Person updatePerson(Person person) {
		Response response = webTarget.path("person").request().put(Entity.json(person));
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
		Person person = readPerson(id);
		Response response = webTarget.path("person/" + id).request().delete();
		if (response.getStatusInfo().toEnum() == Response.Status.OK) {
			return person;
		} else {
			int statusCode = response.getStatus();
			String reason = response.getStatusInfo().getReasonPhrase();
			throw new RuntimeException("deletePerson id: " + id + " failed: " + statusCode + ": " + reason);
		}
	}

}
