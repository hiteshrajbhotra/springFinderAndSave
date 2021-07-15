package com.nit.service;

import java.util.List;

import com.nit.models.Student;

public interface StudentServiceI {
	
	public Student saveStudentDetails(Student s);
	
	public List<Student> findByStudentName(String s);

}
