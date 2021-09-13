package com.hsbc.happytrip.models;

import java.io.Serializable;



/**
 * The persistent class for the usercontactinformation database table.
 * 
 */

public class UserContact implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private long userId;


	private String address;


	private String mobileNo;


	private String pinCode;

	//bi-directional one-to-one association to User

	private User user;

	//bi-directional many-to-one association to City

	private City city;

    public UserContact() {
    }

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}