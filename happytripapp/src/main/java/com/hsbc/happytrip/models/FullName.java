package com.hsbc.happytrip.models;

import lombok.Data;

@Data

public class FullName {
	private String firstName;
	private String lastName;
	private String middleName;
	public FullName(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
}
