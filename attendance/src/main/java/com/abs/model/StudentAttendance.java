package com.abs.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student_attendance")
public class StudentAttendance implements Serializable {

	private static final long serialVersionUID = -3262506268427221061L;

	//`tbl_student_attendance`.`attendance_id`, `tbl_student_attendance`.`teacher_id`, `tbl_student_attendance`.`student_id`, `tbl_student_attendance`.`course_id`, `tbl_student_attendance`.`is_present`, `tbl_student_attendance`.`date`
	
	@Id
	@Column(name = "attendance_id")
	private Long attendanceId;
	
	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
    @JoinTable(name="tbl_teachers",joinColumns=@JoinColumn(name="teacher_id",referencedColumnName="teacher_id"),inverseJoinColumns=@JoinColumn(name="teacher_id",referencedColumnName="teacher_id"))
	private List<Teachers> teachers = new ArrayList<Teachers>(); 
	
	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
    @JoinTable(name="tbl_courses",joinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"),inverseJoinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"))
	private List<Courses> courses = new ArrayList<>();
	
	@ManyToOne
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
	 * @return the teachers
	 */
	public List<Teachers> getTeachers() {
		return teachers;
	}

	/**
	 * @param teachers the teachers to set
	 */
	public void setTeachers(List<Teachers> teachers) {
		this.teachers = teachers;
	}

	/**
	 * @return the courses
	 */
	public List<Courses> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<Courses> courses) {
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
}
