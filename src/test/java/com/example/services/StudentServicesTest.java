package com.example.services;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.DemoApplicationTests;
import com.example.domain.Student;

public class StudentServicesTest extends DemoApplicationTests{
	@Autowired
	private StudentServices studentServices;

	@Before
	public void setup() {
		
	}

	@After
	public void teardown() {

	}

	@Test
	public void test() {
		Student student = new Student();
		student.setAge(30);
		student.setName("test4");
		studentServices.save(student);
	}

	

}
