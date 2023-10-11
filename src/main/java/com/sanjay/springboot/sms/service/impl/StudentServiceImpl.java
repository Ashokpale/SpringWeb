package com.sanjay.springboot.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sanjay.springboot.sms.entities.Student;
import com.sanjay.springboot.sms.repository.StudentRepository;
import com.sanjay.springboot.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepositoty;

	public StudentServiceImpl(StudentRepository studentRepositoty) {
		super();
		this.studentRepositoty = studentRepositoty;
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepositoty.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepositoty.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepositoty.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepositoty.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepositoty.deleteById(id);
	}

}
