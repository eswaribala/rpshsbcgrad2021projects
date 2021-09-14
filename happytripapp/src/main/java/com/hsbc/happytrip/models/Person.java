package com.hsbc.happytrip.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@Data

public abstract class Person {
	
	private String adharCardNo;
	//value object
	private FullName name;
	private LocalDate dob;
	private Address address;
	private GenderType gender;
	
	
	
	//log
	protected abstract Message writeToLog(int level,String message );



	public Person(String adharCardNo, FullName name, LocalDate dob, Address address, GenderType gender) {
		super();
		this.adharCardNo = adharCardNo;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.gender = gender;
	}
	

}
