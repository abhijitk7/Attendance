package com.abs.attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abs.attendance.model.Teachers;
import com.abs.attendance.model.UserInfo;
import com.abs.attendance.service.TeacherService;

/**
 * Authenticates teacher.
 *
 */
@RestController
public class AuthenticationController {

	@Autowired
	private TeacherService teacherService;

	/**
	 * @param userInfo
	 * @return
	 */
	@PostMapping("/authenticate")
	public ResponseEntity<Teachers> authenticateTeacher(@RequestBody final UserInfo userInfo) {
		final Teachers teacher = this.teacherService.validateTeacher(userInfo);
		if (teacher != null) {
			return new ResponseEntity<>(teacher, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}

}
