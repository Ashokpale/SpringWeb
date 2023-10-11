package com.sanjay.springboot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sanjay.springboot.sms.entities.Student;
import com.sanjay.springboot.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentMangementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMangementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Student student1 = new Student("mars", "moon", "space@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("john", "cj", "johnson@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("bhargav", "pillalamary",
		 * "bhargav@gmail.com"); studentRepository.save(student3);
		 */

	}

}
