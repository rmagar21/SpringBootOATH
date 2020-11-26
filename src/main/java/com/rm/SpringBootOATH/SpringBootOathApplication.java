package com.rm.SpringBootOATH;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.rm.SpringBootOATH.model.Student;
import com.rm.SpringBootOATH.model.StudentRepository;

@SpringBootApplication
public class SpringBootOathApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOathApplication.class, args);
	}
	
//	@Component
//	class StudentCommandLineRunner implements CommandLineRunner{
//		private final StudentRepository studentRepository;
//		
//		public StudentCommandLineRunner(StudentRepository studentRepository) {
//			this.studentRepository = studentRepository;
//		}
//
//		@Override
//		public void run(String... args) throws Exception {
//			List<Student> studentList = new ArrayList<>();
//	        studentList.add(new Student(11l, "Roshan", 35, 85000));
//			studentList.add(new Student(12l, "Ram", 33, 75000));
//			studentList.add(new Student(15l, "Deepak", 34, 25000));
//			studentList.add(new Student(13l, "Sonam", 36, 65000));
//			
//			studentRepository.saveAll(studentList);
//			System.out.println("Hello World");
//		}
//		
//	}

}
