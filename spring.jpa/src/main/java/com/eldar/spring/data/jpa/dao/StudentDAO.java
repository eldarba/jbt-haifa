package com.eldar.spring.data.jpa.dao;

import java.util.List;

import com.eldar.spring.data.jpa.entities.Student;

public interface StudentDAO {
	// read All
	List<Student> findAll();

	// read One
	Student findById(int id);

	// create / update
	void save(Student student);

	// delete
	void deleteById(int id);

}
