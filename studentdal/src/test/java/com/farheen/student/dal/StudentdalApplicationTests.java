package com.farheen.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.farheen.student.dal.entities.Student;
import com.farheen.student.dal.repositories.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	StudentRepository repo;
	@Test
	void testCreateStudent() {
		Student student= new Student();
		student.setName("Harry");
		student.setCourse("English 101");
		student.setFee(500d);
		repo.save(student);
	}

	@Test
	void testFindStudentById() {
		Student student =repo.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student =repo.findById(1l).get();
		student.setFee(40d);
		repo.save(student);
	}
	
	@Test
	void testDeleteStudent() {
		Student student =repo.findById(1l).get();
		repo.delete(student);
	}
}
