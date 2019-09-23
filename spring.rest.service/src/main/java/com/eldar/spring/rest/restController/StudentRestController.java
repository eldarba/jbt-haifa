package com.eldar.spring.rest.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eldar.spring.rest.entities.Student;
import com.eldar.spring.rest.services.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping("/students/{id}")
	public Student findById(@PathVariable int id) {
		return studentService.findById(id);
	}

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		student.setId(0);
		studentService.save(student);
		return student;
	}

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		studentService.save(student);
		return student;
	}

	@DeleteMapping("/students")
	public String deleteStudent(@RequestParam("id") int id) {
		Student student = studentService.findById(id);
		if (student != null) {
			studentService.deleteById(id);
			return "student " + id + " deleted.";
		} else {
			return "student " + id + " not found.";
		}
	}

}
