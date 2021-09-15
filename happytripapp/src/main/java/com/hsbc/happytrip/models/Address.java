package com.hsbc.happytrip.models;

import lombok.Data;

@Data
public class Address {

	private String doorNo;
	private String streetName;
	private long pinCode;
	private City city;
	public Address(String doorNo, String streetName, long pinCode, City city) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pinCode = pinCode;
		this.city = city;
	}
	
	

}
