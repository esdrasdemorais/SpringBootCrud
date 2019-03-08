package com.esdrasmorais.springbootcrud.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esdrasmorais.springbootcrud.model.Student;
import com.esdrasmorais.springbootcrud.repository.StudentRepository;

@RestController
public class StudentResource {
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/students")
	public List<Student> retrieveAllStudents() {
		return studentRepository.findAll();
	}
}