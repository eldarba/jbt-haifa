package com.eldar.spring.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eldar.spring.jpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
