package com.eldar.spring.data.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eldar.spring.data.jpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
