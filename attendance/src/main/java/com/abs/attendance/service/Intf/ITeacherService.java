package com.abs.attendance.service.Intf;

import java.util.List;

import com.abs.attendance.model.TeacherCourses;

/**
 * Interface class for Teachers.
 *
 */
public interface ITeacherService {

	/**
	 * @return List<TeacherCourses> the TeacherCourses
	 */
	List<TeacherCourses> findAllTeacherCourses();

}
