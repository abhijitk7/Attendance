package com.abs.attendance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abs.attendance.model.Teachers;
import com.abs.attendance.model.UserInfo;

/**
 * Authenticates teacher.
 *
 */
@RestController
public class AuthenticationController {

	/**
	 * @param userInfo
	 * @return
	 */
	@PostMapping("/authenticate")
	public ResponseEntity<Teachers> authenticateTeacher(@RequestBody final UserInfo userInfo) {
		return null;

	}

}
