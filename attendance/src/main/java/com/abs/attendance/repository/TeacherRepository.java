package com.abs.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abs.attendance.model.Teachers;

/**
 * Repository class for Teachers.
 *
 */
public interface TeacherRepository extends JpaRepository<Teachers, Long> {

	/**
	 * @param emailId
	 * @param password
	 * @return
	 */
	Teachers findByEmailIdAndPassword(String emailId, String password);

}
