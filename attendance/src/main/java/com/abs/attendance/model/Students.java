package com.abs.attendance.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_students")
public class Students implements Serializable {

	private static final long serialVersionUID = 5707232204964014950L;

	//`tbl_students`.`student_id`, `tbl_students`.`student_name`, `tbl_students`.`class_id`, `tbl_students`.`address`
	
	@Id
	@Column(name = "student_id")
	private Long studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "address")
	private String address;
		
	@ManyToOne
	private Classes studentClass;
	
	@OneToMany(mappedBy = "student")
	private Set<StudentAttendance> studentAttendances = new HashSet<>();

	/**
	 * @return the studentId
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the studentClass
	 */
	public Classes getStudentClass() {
		return studentClass;
	}

	/**
	 * @param studentClass the studentClass to set
	 */
	public void setStudentClass(Classes studentClass) {
		this.studentClass = studentClass;
	}

	/**
	 * @return the studentAttendances
	 */
	public Set<StudentAttendance> getStudentAttendances() {
		return studentAttendances;
	}

	/**
	 * @param studentAttendances the studentAttendances to set
	 */
	public void setStudentAttendances(Set<StudentAttendance> studentAttendances) {
		this.studentAttendances = studentAttendances;
	}
	
	
}
