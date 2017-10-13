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
@Table(name = "tbl_student_attendance")
public class StudentAttendance implements Serializable {

	private static final long serialVersionUID = -3262506268427221061L;

	@Id
	@Column(name = "attendance_id")
	private Long attendanceId;

	@OneToOne
	@JoinColumn(name = "teacher_id", nullable = false)
	private Teachers teacher;

	@OneToOne
	@JoinColumn(name = "course_id", nullable = false)
	private Courses course;

	@OneToOne
	@JoinColumn(name = "student_id", nullable = false)
	private Students student;

	@Column(name = "is_present")
	private boolean isPresent;

	@Column(name = "date")
	private Date date;

	/**
	 * @return the attendanceId
	 */
	public Long getAttendanceId() {
		return this.attendanceId;
	}

	/**
	 * @param attendanceId
	 *            the attendanceId to set
	 */
	public void setAttendanceId(final Long attendanceId) {
		this.attendanceId = attendanceId;
	}

	/**
	 * @return the isPresent
	 */
	public boolean isPresent() {
		return this.isPresent;
	}

	/**
	 * @param isPresent
	 *            the isPresent to set
	 */
	public void setPresent(final boolean isPresent) {
		this.isPresent = isPresent;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

	/**
	 * @return the student
	 */
	public Students getStudent() {
		return this.student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudent(final Students student) {
		this.student = student;
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
}
