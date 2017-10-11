package com.abs.attendance.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_students")
public class Students implements Serializable {

	private static final long serialVersionUID = 5707232204964014950L;

	@Id
	@Column(name = "student_id")
	private Long studentId;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "address")
	private String address;

	// @ManyToOne
	// @JoinColumn(name = "class_id")
	// private Classes studentClass;

	@OneToMany(mappedBy = "student")
	private Set<StudentAttendance> studentAttendances = new HashSet<>();

	/**
	 * @return the studentId
	 */
	public Long getStudentId() {
		return this.studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public void setStudentId(final Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return this.studentName;
	}

	/**
	 * @param studentName
	 *            the studentName to set
	 */
	public void setStudentName(final String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

	/**
	 * @return the studentAttendances
	 */
	public Set<StudentAttendance> getStudentAttendances() {
		return this.studentAttendances;
	}

	/**
	 * @param studentAttendances
	 *            the studentAttendances to set
	 */
	public void setStudentAttendances(final Set<StudentAttendance> studentAttendances) {
		this.studentAttendances = studentAttendances;
	}

}
