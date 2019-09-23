package com.eldar.spring.rest.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eldar.spring.rest.entities.Student;
import com.eldar.spring.rest.repositories.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/students")
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

}
