package com.nit.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nit.models.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
	public List<Student> findByStudentName(String name);

}
