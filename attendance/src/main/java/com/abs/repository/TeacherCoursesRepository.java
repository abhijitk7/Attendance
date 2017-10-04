/**
 * 
 */
package com.abs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.abs.model.TeacherCourses;


/**
 * @author Balakrishna
 *
 */
@Component
public interface TeacherCoursesRepository extends JpaRepository<TeacherCourses, Long> {

	/**
	 * @return
	 */
	@Query("")
	List<TeacherCourses> fetchTearcherCourses();

}
