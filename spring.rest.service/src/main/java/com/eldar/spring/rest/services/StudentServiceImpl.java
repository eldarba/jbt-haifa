package com.eldar.spring.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eldar.spring.rest.entities.Student;
import com.eldar.spring.rest.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;

	@Override
	public List<Student> findAll() {
		return repo.findAll();
	}

	@Override
	public Student findById(int id) {
		Optional<Student> result = repo.findById(id);
		if (result.isPresent()) {
			Student student = result.get();
			return student;
		}
		return null;
	}

	@Override
	public void save(Student student) {
		repo.save(student);

	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);

	}

}
