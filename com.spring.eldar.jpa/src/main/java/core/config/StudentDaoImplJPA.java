package core.config;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class StudentDaoImplJPA implements StudentDao {

	@PersistenceContext // DI
	private EntityManager em;

	@Override
	@Transactional
	public Student getStudent(int id) {
		Student student = em.find(Student.class, id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveStudent(Student student) {

	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

}
