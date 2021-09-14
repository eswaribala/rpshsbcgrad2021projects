package com.hsbc.happytrip.models;

import lombok.Data;

@Data
public class Address {

	private String doorNo;
	private String streetName;
	private long pinCode;
	private City city;

}
