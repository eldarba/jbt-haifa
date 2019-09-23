package com.eldar.spring.rest.services;

import java.util.List;

import com.eldar.spring.rest.entities.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int id);

	void save(Student student);

	void deleteById(int id);
}
