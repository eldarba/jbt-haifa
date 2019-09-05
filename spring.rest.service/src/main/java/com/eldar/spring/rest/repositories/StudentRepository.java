package com.eldar.spring.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eldar.spring.rest.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
