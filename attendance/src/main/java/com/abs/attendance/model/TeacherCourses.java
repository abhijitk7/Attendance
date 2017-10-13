package com.abs.attendance.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_teacher_courses")
public class TeacherCourses implements Serializable {

	private static final long serialVersionUID = 4809757820501332798L;

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "assigned_date")
	private Date assignedDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "active")
	private boolean active;

	@OneToOne
	@JoinColumn(name = "teacher_id", nullable = false)
	private Teachers teacher;

	@OneToOne
	@JoinColumn(name = "course_id", nullable = false)
	private Courses course;

	@OneToOne
	@JoinColumn(name = "class_id", nullable = false)
	private Classes classes;

	/**
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @return the assignedDate
	 */
	public Date getAssignedDate() {
		return this.assignedDate;
	}

	/**
	 * @param assignedDate
	 *            the assignedDate to set
	 */
	public void setAssignedDate(final Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return this.endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return this.active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(final boolean active) {
		this.active = active;
	}

	/**
	 * @return the teacher
	 */
	public Teachers getTeacher() {
		return this.teacher;
	}

	/**
	 * @param teacher
	 *            the teacher to set
	 */
	public void setTeacher(final Teachers teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the course
	 */
	public Courses getCourse() {
		return this.course;
	}

	/**
	 * @param course
	 *            the course to set
	 */
	public void setCourse(final Courses course) {
		this.course = course;
	}

	/**
	 * @return the classes
	 */
	public Classes getClasses() {
		return this.classes;
	}

	/**
	 * @param classes
	 *            the classes to set
	 */
	public void setClasses(final Classes classes) {
		this.classes = classes;
	}

}
