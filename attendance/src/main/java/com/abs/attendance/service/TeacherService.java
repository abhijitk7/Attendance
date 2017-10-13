/**
 *
 */
package com.abs.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abs.attendance.model.TeacherCourses;
import com.abs.attendance.repository.TeacherCoursesRepository;
import com.abs.attendance.service.Intf.ITeacherService;

/**
 * The Teacher Service;
 *
 */
@Service
public class TeacherService implements ITeacherService {

	@Autowired
	private TeacherCoursesRepository teacherCoursesRepo;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.abs.attendance.service.Intf.ITeacherService#findAllTeacherCourses()
	 */
	@Override
	public List<TeacherCourses> findAllTeacherCourses() {

		return this.teacherCoursesRepo.findAll();
	}

}
