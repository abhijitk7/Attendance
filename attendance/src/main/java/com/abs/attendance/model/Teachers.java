package com.abs.attendance.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_teachers")
public class Teachers implements Serializable {

	private static final long serialVersionUID = -5675611736425246221L;

	@Id
	@Column(name = "teacher_id")
	private Long teacherId;

	@Column(name = "tearcher_name")
	private String teacherName;

	@Column(name = "department")
	private String department;

	@Column(name = "emailId")
	private String emailId;

	@Column(name = "password")
	private String password;

	/**
	 * @return the teacherId
	 */
	public Long getTeacherId() {
		return this.teacherId;
	}

	/**
	 * @param teacherId
	 *            the teacherId to set
	 */
	public void setTeacherId(final Long teacherId) {
		this.teacherId = teacherId;
	}

	/**
	 * @return the teacherName
	 */
	public String getTeacherName() {
		return this.teacherName;
	}

	/**
	 * @param teacherName
	 *            the teacherName to set
	 */
	public void setTeacherName(final String teacherName) {
		this.teacherName = teacherName;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return this.department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(final String department) {
		this.department = department;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return this.emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(final String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}
}
