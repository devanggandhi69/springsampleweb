package com.vs.hr.vo;

public class UserVO {
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;

	public UserVO() {
		super();
	}

	public UserVO(int id, String firstName, String lastName, String middleName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public int getId() {
		return id;
	}

	public void setFirstName(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
}
