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
@Table(name = "tbl_courses")
public class Courses implements Serializable {

	private static final long serialVersionUID = -5476572857065409200L;
	
	@Id
	@Column(name = "course_id")
	private Long courseId;
	
	@Column(name = "course_name")
	private String courseName;
	
	@OneToMany(mappedBy = "courses")
	private Set<StudentAttendance> studentAttendances = new HashSet<>();

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
