package com.farheen.student.dal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.farheen.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
