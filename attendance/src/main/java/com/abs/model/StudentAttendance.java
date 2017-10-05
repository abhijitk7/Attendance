package com.abs.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student_attendance")
public class StudentAttendance implements Serializable {

	private static final long serialVersionUID = -3262506268427221061L;

	
	@Id
	@Column(name = "attendance_id")
	private Long attendanceId;
	
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teachers teachers; 
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Courses courses; 
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Students student; 
	
	
	@Column(name = "is_present")
	private boolean isPresent;
	
	@Column(name = "date")
	private Date date;

	/**
	 * @return the attendanceId
	 */
	public Long getAttendanceId() {
		return attendanceId;
	}

	/**
	 * @param attendanceId the attendanceId to set
	 */
	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}


	/**
	 * @return the isPresent
	 */
	public boolean isPresent() {
		return isPresent;
	}

	/**
	 * @param isPresent the isPresent to set
	 */
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the teachers
	 */
	public Teachers getTeachers() {
		return teachers;
	}

	/**
	 * @param teachers the teachers to set
	 */
	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}

	/**
	 * @return the courses
	 */
	public Courses getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	/**
	 * @return the student
	 */
	public Students getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Students student) {
		this.student = student;
	}
}
