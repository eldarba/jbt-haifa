package com.eldar.rest.service.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eldar.rest.service.server.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
