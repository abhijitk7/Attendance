package com.abs.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abs.attendance.model.Students;
import com.abs.attendance.model.TeacherCourses;
import com.abs.attendance.model.Teachers;
import com.abs.attendance.service.StaticDataService;
import com.abs.attendance.service.TeacherService;

/**
 * Controller class for Static data.
 *
 */
@RestController
@RequestMapping("/staticData")
public class StaticDataController {

	@Autowired
	private StaticDataService studService;

	@Autowired
	private TeacherService teacherService;

	/**
	 * @return
	 */
	@GetMapping("/students")
	public List<Students> getStudents() {
		return this.studService.findAllStudents();
	}

	/**
	 * @return
	 */
	@GetMapping("/teacher/courses")
	public List<TeacherCourses> getTeachersCourses() {
		return this.teacherService.findAllTeacherCourses();
	}

	/**
	 * @return
	 */
	@GetMapping("/teacher/{teacherId}")
	public Teachers getTeacher(@PathVariable final Long teacherId) {
		return this.teacherService.findTeacher(teacherId);
	}

	@PostMapping("/teacher/course")
	public List<TeacherCourses> getTeacherCourses(@RequestBody final Teachers teacher) {
		return this.teacherService.findTeacherCourses(teacher);
	}

}
