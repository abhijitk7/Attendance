package com.abs.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abs.attendance.model.Courses;
import com.abs.attendance.model.StudentAttendance;
import com.abs.attendance.model.Teachers;

/**
 * Repository class for Student Attendance.
 *
 */
public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, Long> {

	/**
	 * @param teacher
	 * @param course
	 * @return
	 */
	List<StudentAttendance> findByTeacherAndCourse(Teachers teacher, Courses course);

}
