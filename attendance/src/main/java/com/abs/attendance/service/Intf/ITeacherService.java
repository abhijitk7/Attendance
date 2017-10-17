package com.abs.attendance.service.Intf;

import java.util.List;

import com.abs.attendance.model.TeacherCourses;
import com.abs.attendance.model.Teachers;
import com.abs.attendance.model.UserInfo;

/**
 * Interface class for Teachers.
 *
 */
public interface ITeacherService {

	/**
	 * @return List<TeacherCourses> the TeacherCourses
	 */
	List<TeacherCourses> findAllTeacherCourses();

	/**
	 * @param teacherId
	 * @return
	 */
	Teachers findTeacher(Long teacherId);

	/**
	 * @param teacher
	 * @return the List<TeacherCourses>
	 */
	List<TeacherCourses> findTeacherCourses(Teachers teacher);

	/**
	 * @param user
	 * @return
	 */
	Teachers validateTeacher(UserInfo user);

}
