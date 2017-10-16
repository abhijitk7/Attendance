/**
 *
 */
package com.abs.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abs.attendance.model.Classes;
import com.abs.attendance.model.Students;

/**
 * Repository class for Student repository.
 *
 */
public interface StudentRepository extends JpaRepository<Students, Long> {

	/**
	 * @param division
	 * @return
	 */
	List<Students> findStudentsByClasses(Classes division);

}
