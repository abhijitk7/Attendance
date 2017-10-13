package com.abs.attendance.model;

import java.io.Serializable;

/**
 * Filter class for attendace.
 *
 */
public class AttendanceFilter implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6089394780608337023L;

	private Long teacherId;

	private Long courseId;

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
	 * @return the courseId
	 */
	public Long getCourseId() {
		return this.courseId;
	}

	/**
	 * @param courseId
	 *            the courseId to set
	 */
	public void setCourseId(final Long courseId) {
		this.courseId = courseId;
	}

}
