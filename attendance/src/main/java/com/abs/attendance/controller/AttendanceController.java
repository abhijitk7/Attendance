package com.abs.attendance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	private static final Logger log = LoggerFactory.getLogger(AttendanceController.class);

	@Autowired
	private AttendanceService attendanceService;

	/**
	 * @param fliter
	 * @return
	 */
	@PostMapping("data/all")
	List<StudentAttendance> getAttendace(@RequestBody final AttendanceFilter fliter) {
		return this.attendanceService.findAttendaceByTeacherAndCourse(fliter);
	}

	@PostMapping
	ResponseEntity<Void> markAttendance(@RequestBody final List<StudentAttendance> attendance) {
		try {
			this.attendanceService.saveAttendace(attendance);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (final Exception ex) {
			log.error(ex.getMessage(), ex);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
