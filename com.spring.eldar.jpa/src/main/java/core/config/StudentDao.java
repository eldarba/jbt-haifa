package core.config;

import java.util.List;

public interface StudentDao {

	Student getStudent(int id);

	List<Student> getAllStudents();

	void saveStudent(Student student);

	void deleteStudent(int id);

	void updateStudent(Student student);

}
