package com.eldar.rest.service.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eldar.rest.service.server.entities.Person;
import com.eldar.rest.service.server.repositories.PersonRepository;

@RestController
@RequestMapping("api/")
public class PersonRestController {

	@Autowired
	private PersonRepository personRepository;

//	@PostMapping("person")
//	@PutMapping("person")
	@RequestMapping(value = "person", method = { RequestMethod.POST, RequestMethod.PUT })
	public Person create(@RequestBody Person person) {
		personRepository.save(person);
		return person;
	}

	@GetMapping("person-all")
	public List<Person> viewAll() {
		return personRepository.findAll();
	}

	@GetMapping("person/{id}")
	public Person viewById(@PathVariable("id") int id) {
		return personRepository.findById(id).get();
	}

	@DeleteMapping("person/{id}")
	public void deleteById(@PathVariable("id") int id) {
		Person p = new Person();
		p.setId(id);
		personRepository.delete(p);
	}

}
