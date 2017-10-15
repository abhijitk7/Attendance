/**
 *
 */
package com.abs.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abs.attendance.model.TeacherCourses;
import com.abs.attendance.model.Teachers;
import com.abs.attendance.repository.TeacherCoursesRepository;
import com.abs.attendance.repository.TeacherRepository;
import com.abs.attendance.service.Intf.ITeacherService;

/**
 * The Teacher Service;
 *
 */
@Service
public class TeacherService implements ITeacherService {

	@Autowired
	private TeacherCoursesRepository teacherCoursesRepo;

	@Autowired
	private TeacherRepository teacherRepo;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.abs.attendance.service.Intf.ITeacherService#findAllTeacherCourses()
	 */
	@Override
	public List<TeacherCourses> findAllTeacherCourses() {
		return this.teacherCoursesRepo.findAll();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.abs.attendance.service.Intf.ITeacherService#findTeacher(java.lang.Long)
	 */
	@Override
	public Teachers findTeacher(final Long teacherId) {
		return this.teacherRepo.findOne(teacherId);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.abs.attendance.service.Intf.ITeacherService#findTeacherCourses(com.abs.
	 * attendance.model.Teachers)
	 */
	@Override
	public List<TeacherCourses> findTeacherCourses(final Teachers teacher) {
		return this.teacherCoursesRepo.findByTeacher(teacher);
	}

}
