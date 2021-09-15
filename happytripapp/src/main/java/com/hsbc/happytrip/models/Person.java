package com.hsbc.happytrip.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
public  class Person {
	
	private String adharCardNo;
	//value object
	private FullName name;
	private LocalDate dob;
	private Address address;
	private GenderType gender;
	
	public Person(String adharCardNo, FullName name) {
		super();
		this.adharCardNo = adharCardNo;
		this.name = name;
	}

	public Person(LocalDate dob, Address address, GenderType gender) {
		super();
		this.dob = dob;
		this.address = address;
		this.gender = gender;
	}

	

	public Person(String adharCardNo, FullName name, LocalDate dob, Address address, GenderType gender) {
		//super();
		this(adharCardNo,name);
		//this(dob,address,gender);
	}


	//log
		protected Message writeToLog(int level,String message ) {
			return new Message();
		}

	public String getAdharCardNo() {
		return adharCardNo;
	}



	public void setAdharCardNo(String adharCardNo) {
		this.adharCardNo = adharCardNo;
	}



	public FullName getName() {
		return name;
	}



	public void setName(FullName name) {
		this.name = name;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public GenderType getGender() {
		return gender;
	}



	public void setGender(GenderType gender) {
		this.gender = gender;
	}



	


	
/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.adharCardNo+","+this.getName().getFirstName();
	}
	
*/
}
