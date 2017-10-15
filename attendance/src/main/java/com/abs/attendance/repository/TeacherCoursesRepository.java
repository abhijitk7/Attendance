/**
 *
 */
package com.abs.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.abs.attendance.model.TeacherCourses;
import com.abs.attendance.model.Teachers;

/**
 * @author Balakrishna
 *
 */
@Component
public interface TeacherCoursesRepository extends JpaRepository<TeacherCourses, Long> {

	/**
	 * @param teacher
	 * @return
	 */
	List<TeacherCourses> findByTeacher(Teachers teacher);

}
