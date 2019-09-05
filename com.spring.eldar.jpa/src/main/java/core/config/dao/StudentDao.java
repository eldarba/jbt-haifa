package core.config.dao;

import java.util.List;

import core.config.entities.Student;

public interface StudentDao {

	Student getStudent(int id);

	List<Student> getAllStudents();

	void saveStudent(Student student);

	void deleteStudent(int id);

	void updateStudent(Student student);

}
