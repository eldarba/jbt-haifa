package rest.client.jersey;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// business delegate
public class BusinessDelegate {

	private ClientConfig clientConfig = new ClientConfig();
	private Client client = ClientBuilder.newClient(clientConfig);
	private WebTarget webTarget = client.target("http://localhost:8080/api/");
	private ObjectMapper objectMapper = new ObjectMapper();

	public Person createPerson(Person person) throws JsonProcessingException {
		String str = objectMapper.writeValueAsString(person);
		Entity<String> personAsJson = Entity.json(str);
		Builder builder = webTarget.path("person").request();
		Response response = builder.post(personAsJson);
		Person result = response.readEntity(Person.class);
		return result;
	}

	public Person readPerson(int id) {
		Builder builder = webTarget.path("person/" + id).request(MediaType.APPLICATION_JSON);
		Response response = builder.get(Response.class);
		Person person = response.readEntity(new GenericType<Person>() {
		});
		return person;
	}

	public List<Person> readAllPerson() {
		Builder builder = webTarget.path("person-all").request(MediaType.APPLICATION_JSON);
		Response response = builder.get(Response.class);
		List<Person> list = response.readEntity(new GenericType<List<Person>>() {
		});
		return list;
	}

	public Person updatePerson(Person person) throws JsonProcessingException {
		Entity<String> personAsJson = Entity.json(objectMapper.writeValueAsString(person));
		Builder builder = webTarget.path("person").request();
		Response response = builder.put(personAsJson);
		Person result = response.readEntity(Person.class);
		return result;
	}

	public Person deletePerson(int id) {
		Builder builder = webTarget.path("person/" + id).request(MediaType.APPLICATION_JSON);
		Response response = builder.delete(Response.class);
		Person person = response.readEntity(new GenericType<Person>() {
		});
		return person;
	}

}
