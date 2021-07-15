package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.models.Student;
import com.nit.service.StudentServiceI;

@Controller("studentRunner")
public class StudentController {
	
	@Autowired
	StudentServiceI studentService;
	
	public Student saveStudent(Student s) {
		return studentService.saveStudentDetails(s);
	}
	
	public List<Student> getStudents(String s){
		return studentService.findByStudentName(s);
	}

}
