package com.abs.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_teachers")
public class Teachers implements Serializable {

	private static final long serialVersionUID = -5675611736425246221L;

	//`tbl_teachers`.`teacher_id`, `tbl_teachers`.`tearcher_name`, `tbl_teachers`.`department`
	
	@Id
	@Column(name = "teacher_id")
	private Long teacherId;
	
	@Column(name = "tearcher_name")
	private String teacherName;
	
	@Column(name = "department")
	private String department;
	
	@OneToMany(mappedBy = "teachers")
	private Set<StudentAttendance> studentAttendances = new HashSet<>();

	/**
	 * @return the teacherId
	 */
	public Long getTeacherId() {
		return teacherId;
	}

	/**
	 * @param teacherId the teacherId to set
	 */
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	/**
	 * @return the teacherName
	 */
	public String getTeacherName() {
		return teacherName;
	}

	/**
	 * @param teacherName the teacherName to set
	 */
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
}
