//package com.rm.SpringBootOATH.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.rm.SpringBootOATH.model.Student;
//import com.rm.SpringBootOATH.model.StudentRepository;
//
//@Service
//public class StudentService {
//	
//	@Autowired
//	StudentRepository studentRepo;
//	
//	public List<Student> findAll(){
//		return studentRepo.findAll();
//    	
//    }
//    
//	public Optional<Student> findById(Long id) {
//		return studentRepo.findById(id);
//    	
//    }
//    
//	public Student saveStudent(Student student) {
//		return studentRepo.save(student);
//    	
//    }
//	
//	public void deleteStudent(Long id) {
//		  studentRepo.deleteById(id);
//	}
//
//}
