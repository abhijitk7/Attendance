/**
 *
 */
package com.abs.attendance.service.Intf;

import java.util.List;

import com.abs.attendance.model.Classes;
import com.abs.attendance.model.Students;

/**
 * Interface class for Static Data Service.
 *
 */
public interface IStaticDataService {

	/**
	 * @return the List<Students>
	 */
	List<Students> findAllStudents();

	/**
	 * @param division
	 * @return
	 */
	List<Students> findAllStudentsInClass(Classes division);
}
