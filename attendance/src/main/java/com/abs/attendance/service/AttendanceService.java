/**
 *
 */
package com.abs.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abs.attendance.model.AttendanceFilter;
import com.abs.attendance.model.StudentAttendance;
import com.abs.attendance.repository.CourseRepository;
import com.abs.attendance.repository.StudentAttendanceRepository;
import com.abs.attendance.repository.TeacherRepository;
import com.abs.attendance.service.Intf.IAttendaceService;

/**
 * Service class for attendance.
 *
 */
@Service
public class AttendanceService implements IAttendaceService {

	@Autowired
	private StudentAttendanceRepository repo;

	@Autowired
	private TeacherRepository teacherRepo;

	@Autowired
	private CourseRepository courseRepo;

	@Override
	public void saveAttendace(final List<StudentAttendance> attendance) {
		// for (final StudentAttendance studAttendance : attendance) {
		this.repo.save(attendance);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.abs.attendance.service.Intf.IAttendaceService#
	 * findAttendaceByTeacherAndCourse(com.abs.attendance.model.AttendanceFilter)
	 */
	@Override
	public List<StudentAttendance> findAttendaceByTeacherAndCourse(final AttendanceFilter filter) {
		return this.repo.findByTeacherAndCourse(this.teacherRepo.findOne(filter.getTeacherId()),
				this.courseRepo.findOne(filter.getCourseId()));
	}

}
