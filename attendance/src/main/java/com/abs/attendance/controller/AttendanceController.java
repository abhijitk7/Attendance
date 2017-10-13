package com.abs.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abs.attendance.model.AttendanceFilter;
import com.abs.attendance.model.StudentAttendance;
import com.abs.attendance.service.AttendanceService;

/**
 * Controller class for Attendance.
 *
 */
@RestController
@RequestMapping("/attendance")
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;

	@PostMapping
	List<StudentAttendance> getAttendace(@RequestBody final AttendanceFilter fliter) {
		return this.attendanceService.findAttendaceByTeacherAndCourse(fliter);
	}

}
