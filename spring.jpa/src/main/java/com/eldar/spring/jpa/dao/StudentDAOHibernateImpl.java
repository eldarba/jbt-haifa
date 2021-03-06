package com.eldar.spring.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eldar.spring.jpa.entities.Student;

@Repository
@Primary
@Transactional
public class StudentDAOHibernateImpl implements StudentDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Student> findAll() {

		Session session = entityManager.unwrap(Session.class);
		Query<Student> query = session.createQuery("from Student", Student.class);
		return query.getResultList();
	}

	@Override
	public Student findById(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Student.class, id);
	}

	@Override
	public void save(Student student) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(student);
	}

	@Override
	public void deleteById(int id) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(id);
	}

}
