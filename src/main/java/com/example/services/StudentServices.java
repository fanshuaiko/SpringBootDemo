package com.example.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Student;
import com.example.repository.StudentRepository;

@Service
@Transactional
public class StudentServices {
	@Autowired
	private StudentRepository studentRepository;
	
	public void save(Student student) {
		studentRepository.save(student);
	}
	
	public Optional<Student> findById(Integer id) {
		Optional<Student> student = studentRepository.findById(id);
		return student;
	}
}
