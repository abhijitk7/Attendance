/**
 * 
 */
package com.abs.attendance.service.Intf;

import java.util.List;

import com.abs.attendance.model.Students;
import com.abs.attendance.model.Teachers;

/**
 * Interface class for Static Data Service.
 *
 */
public interface IStaticDataService {

	/**
	 * @return
	 * 		the List<Students>
	 */
	List<Students> findAllStudents();
	
	/**
	 * @return
	 *  	the List<Teachers>
	 */
	List<Teachers> findAllTeachers();
}
