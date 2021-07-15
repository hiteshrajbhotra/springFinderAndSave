package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.StudentController;

@Component("studRun")
public class StudentRunner implements CommandLineRunner {

	@Autowired
	StudentController studentController;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student s = studentController.saveStudent(new Student("Mahesh", "P00029"));
		 * 
		 * System.out.println(s);
		 */
		
		studentController.getStudents("Hitesh").forEach(student -> {
			System.out.println(student);
		});

	}

}
