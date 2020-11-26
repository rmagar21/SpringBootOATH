package com.rm.SpringBootOATH.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
//@WebFluxTest(StudentController.class)
public class StudentControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getAll() throws Exception {
		  mvc.perform( MockMvcRequestBuilders
			      .get("/api/studentslist")
			      .accept(MediaType.APPLICATION_JSON))
			      .andDo(print())
			      .andExpect(status().isOk());
			
	}
			 
   @Test
   public void getEmployee_whenEmployeeIdIsPassed() {
	   
   }
}
