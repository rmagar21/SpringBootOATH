package com.rm.SpringBootOATH.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	
//	public List<Student> findAll();
//	public Optional<Student> findById(Long id);
//	public Student saveStudent(Student student); 
}
