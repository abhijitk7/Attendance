/**
 *
 */
package com.abs.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.abs.attendance.model.TeacherCourses;

/**
 * @author Balakrishna
 *
 */
@Component
public interface TeacherCoursesRepository extends JpaRepository<TeacherCourses, Long> {

}
