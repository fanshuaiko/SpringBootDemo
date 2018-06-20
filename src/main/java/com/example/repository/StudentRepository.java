package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
