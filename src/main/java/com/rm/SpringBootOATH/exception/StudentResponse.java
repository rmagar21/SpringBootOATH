package com.rm.SpringBootOATH.exception;

import com.rm.SpringBootOATH.model.Student;

public class StudentResponse {
	private Student student;
    private String message;
	
    public StudentResponse(Student student, String message) {
		super();
		this.student = student;
		this.message = message;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}   
    
}
