package com.eldar.spring.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eldar.spring.jpa.entities.Student;

@Repository
@Transactional
public class StudentDAOJpaImpl implements StudentDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Student> findAll() {
		TypedQuery<Student> query = entityManager.createQuery("from Student", Student.class);
		return query.getResultList();
	}

	@Override
	public Student findById(int id) {
		return entityManager.find(Student.class, id);
	}

	@Override
	public void save(Student student) {
		student = entityManager.merge(student);
	}

	@Override
	public void deleteById(int id) {
		try {
			entityManager.remove(id);
		} catch (Exception e) {
			System.out.println("Student with id " + id + " not found");
		}
	}

}
