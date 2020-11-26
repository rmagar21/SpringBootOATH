package com.rm.SpringBootOATH.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rm.SpringBootOATH.model.Student;
import com.rm.SpringBootOATH.model.StudentRepository;

@Controller
//@RequestMapping("/api")
public class StudentController {

//	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/signup")
	public String showSignUpForm(Student student) {
		return "add-user";
	}

	@PostMapping("/addstudent")
	public String addStudent(Student student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-user";
		}

		studentRepo.save(student);
		model.addAttribute("students", studentRepo.findAll());
		return "redirect:/index";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {
		Student student = studentRepo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));

		model.addAttribute("student", student);
		return "update-student";
	}

	@PostMapping("/update/{id}")
	public String updateStudent(@PathVariable("id") long id, Student student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			student.setId(id);
			return "update-student";
		}

		studentRepo.save(student);
		model.addAttribute("students", studentRepo.findAll());
		return "redirect:/index";
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Student student = studentRepo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		studentRepo.delete(student);
		model.addAttribute("students", studentRepo.findAll());
		return "index";
	}

//	@GetMapping("/display")
//	public ModelAndView showDisplay(){
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("display");
//		return mv;
//	}
//	
//	@PostMapping("/student")
//	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
//        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);
//		
//	}

//	@PostMapping("/student")
//	public Student saveStudent(@RequestBody Student student){
//         return studentService.saveStudent(student);		
//	}
//	
//	@GetMapping("/studentslist")
//	public List<Student> getAllStudents(){
//	    return studentService.findAll();
//		
//	}
//	
//	@GetMapping("/student/{id}")
//	public Optional<Student> getStudentWithId(@PathVariable(value = "id") Long studentId){
//	    return studentService.findById(studentId);	
//	}
//	
//	@DeleteMapping("/student/{id}")
//	public ResponseEntity<Student> deleteStudentById(@PathVariable Long id){
//		if(!studentService.findById(id).isPresent()) {
//			System.out.println("Student with studentid %d, not found" + id);
//		}
//	    studentService.deleteStudent(id);
//	    return ResponseEntity.ok().build();
//	}

}
