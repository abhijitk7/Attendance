package com.abs.attendance.model;

import java.io.Serializable;

/**
 * Model class for teacher Authentication.
 *
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 4411984198236454367L;

	private String userName;

	private String password;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(final String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

}
