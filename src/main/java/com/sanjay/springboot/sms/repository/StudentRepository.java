package com.sanjay.springboot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjay.springboot.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
