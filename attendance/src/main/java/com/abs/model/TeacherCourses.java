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
import javax.persistence.Table;

@Entity
@Table(name = "tbl_teacher_courses")
public class TeacherCourses implements Serializable {

	private static final long serialVersionUID = 4809757820501332798L;

	//`tbl_teacher_courses`.`id`, `tbl_teacher_courses`.`teacher_id`, `tbl_teacher_courses`.`course_id`, `tbl_teacher_courses`.`class_id`, `tbl_teacher_courses`.`assigned_date`, `tbl_teacher_courses`.`end_date`, `tbl_teacher_courses`.`active`
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
    @JoinTable(name="tbl_teachers",joinColumns=@JoinColumn(name="teacher_id",referencedColumnName="teacher_id"),inverseJoinColumns=@JoinColumn(name="teacher_id",referencedColumnName="teacher_id"))
	private List<Teachers> teachers = new ArrayList<>();
	
	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
    @JoinTable(name="tbl_courses",joinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"),inverseJoinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"))
	private List<Courses> courses = new ArrayList<>();
	
	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
    @JoinTable(name="tbl_classes",joinColumns=@JoinColumn(name="class_id",referencedColumnName="class_id"),inverseJoinColumns=@JoinColumn(name="class_id",referencedColumnName="class_id"))
	private List<Classes> classes = new ArrayList<>();
	
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
	 * @return the classes
	 */
	public List<Classes> getClasses() {
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(List<Classes> classes) {
		this.classes = classes;
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
