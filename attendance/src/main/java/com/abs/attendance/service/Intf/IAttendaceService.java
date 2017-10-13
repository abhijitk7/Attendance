package com.abs.attendance.service.Intf;

import java.util.List;

import com.abs.attendance.model.AttendanceFilter;
import com.abs.attendance.model.StudentAttendance;

public interface IAttendaceService {

	/**
	 * @param attendance
	 */
	void saveAttendace(List<StudentAttendance> attendance);

	/**
	 * @param filter
	 *            the AttendanceFilter
	 * @return List<StudentAttendance> the StudentAttendance
	 */
	List<StudentAttendance> findAttendaceByTeacherAndCourse(AttendanceFilter filter);

}
