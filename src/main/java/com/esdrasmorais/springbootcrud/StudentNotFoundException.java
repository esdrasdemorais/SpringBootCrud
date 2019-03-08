package com.esdrasmorais.springbootcrud;

public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(String exception) {
		super(exception);
	}
}
