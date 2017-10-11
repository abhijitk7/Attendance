/**
 * 
 */
package com.abs.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abs.attendance.model.Students;
import com.abs.attendance.service.StaticDataService;

/**
 * Controller class for Students.
 *
 */
@RestController
@RequestMapping("/staticData")
public class StudentController {
	
	
	 @Autowired
	 private StaticDataService studService; 
	 
	 
	 /**
	 * @return
	 */
	@GetMapping("/students")
	 public List<Students> getStudents(){
		return this.studService.findAllStudents();
	 }

}
