package com.abs.attendance.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	public Long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(final Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(final String courseName) {
		this.courseName = courseName;
	}
}
