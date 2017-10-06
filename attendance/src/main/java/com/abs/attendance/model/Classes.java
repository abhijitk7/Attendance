package com.abs.attendance.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_classes")
public class Classes implements Serializable {

	private static final long serialVersionUID = -5870090218887119225L;

	//`tbl_classes`.`class_id`, `tbl_classes`.`year`, `tbl_classes`.`semester`, `tbl_classes`.`section`, `tbl_classes`.`branch`
	
	@Id
	@Column(name = "class_id")
	private Long classId;
	
	@Column(name = "year")
	private Long year;
	
	@Column(name = "semester")
	private Long semester;
	
	@Column(name = "section")
	private String section;
	
	@Column(name = "branch")
	private String branch;

	/**
	 * @return the classId
	 */
	public Long getClassId() {
		return classId;
	}

	/**
	 * @param classId the classId to set
	 */
	public void setClassId(Long classId) {
		this.classId = classId;
	}

	/**
	 * @return the year
	 */
	public Long getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Long year) {
		this.year = year;
	}

	/**
	 * @return the semester
	 */
	public Long getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(Long semester) {
		this.semester = semester;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}
