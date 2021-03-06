package core.config.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import core.config.entities.Student;

@Repository
@Primary
@Transactional
public class StudentDaoImplJPA implements StudentDao {

	@PersistenceContext // DI
	private EntityManager em;

	@Override
	public Student getStudent(int id) {
		Student student = em.find(Student.class, id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String hql = "from Student";
		// type safe query
		TypedQuery<Student> query = em.createQuery(hql, Student.class);
		List<Student> students = query.getResultList();
		return students;
	}

	@Override
	public void saveStudent(Student student) {
		em.persist(student);
	}

	/*
	 * if you want to start and end a transaction:
	 */
	public void saveStudentNonTransactiona(Student student) {
		try {
			em.getTransaction().begin();
			em.persist(student);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteStudent(int id) {
		Student std = getStudent(id);
		em.remove(std);
	}

	/**
	 * the method get a student (assumed not persistent) and find a representation
	 * of this student in the database. if found update according to state of
	 * student parameter
	 */
	@Override
	public void updateStudent(Student student) {
		Student stdFromDb = getStudent(student.getId());
		stdFromDb.setName(student.getName());
		stdFromDb.setEmail(student.getEmail());
	}

}
