/**
 * 
 */
package com.abs.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abs.attendance.model.TeacherCourses;
import com.abs.attendance.repository.TeacherCoursesRepository;



@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

	@Autowired
	private TeacherCoursesRepository teacherCoursesRepository;

	@GetMapping(value = "/courses")
	public List<TeacherCourses> getClassesCourserAssignedToTeacher() {
		
		return teacherCoursesRepository.fetchTearcherCourses();
	}
}
