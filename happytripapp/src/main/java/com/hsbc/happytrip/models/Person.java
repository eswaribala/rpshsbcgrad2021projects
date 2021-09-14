package com.hsbc.happytrip.models;

import java.time.LocalDate;

import lombok.Data;
@Data
public class Person {
	
	private String adharCardNo;
	//value object
	private FullName name;
	private LocalDate dob;
	private Address address;
	private GenderType gender;

}
