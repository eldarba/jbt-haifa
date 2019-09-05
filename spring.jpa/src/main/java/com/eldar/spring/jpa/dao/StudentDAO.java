package com.eldar.spring.jpa.dao;

import java.util.List;

import com.eldar.spring.jpa.entities.Student;

public interface StudentDAO {

	List<Student> findAll();

	Student findById(int id);

	void save(Student student);

	void deleteById(int id);

}
