package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.models.Student;
import com.nit.repositories.StudentRepository;

@Service("studentService")
public class StudentService implements StudentServiceI{

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public Student saveStudentDetails(Student s) {
		return studentRepo.save(s);
	}

	@Override
	public List<Student> findByStudentName(String s) {
		return studentRepo.findByStudentName(s);
	}

}
