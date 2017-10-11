package com.abs.attendance.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_teacher_courses")
public class TeacherCourses implements Serializable {

	private static final long serialVersionUID = 4809757820501332798L;

	//`tbl_teacher_courses`.`id`, `tbl_teacher_courses`.`teacher_id`, `tbl_teacher_courses`.`course_id`, `tbl_teacher_courses`.`class_id`, `tbl_teacher_courses`.`assigned_date`, `tbl_teacher_courses`.`end_date`, `tbl_teacher_courses`.`active`
	
	@Id
	@Column(name = "id")
	private Long id;
	

	
	@Column(name = "assigned_date")
	private Date assignedDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "active")
	private boolean active;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the assignedDate
	 */
	public Date getAssignedDate() {
		return assignedDate;
	}

	/**
	 * @param assignedDate the assignedDate to set
	 */
	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
