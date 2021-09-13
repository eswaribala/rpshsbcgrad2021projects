package com.hsbc.happytrip.models;

import java.io.Serializable;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the users database table.
 * 
 */

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private long userId;

  
	private Date createdDate;


	private Date dateOfBirth;

	
	private String fullName;


	private String gender;

	
	private String loginId;

	
	private String email;


	private String password;
	
	private boolean enabled;

	//bi-directional one-to-one association to Usercontactinformation
	
	private UserContact userContact;
	

	private List<Role> roles = new ArrayList<Role>();
	

	private float miles;
	
	public User() {
    }
	
	public void addRole(Role role){
		this.roles.add(role);
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getCreatedDate() {
		if(this.createdDate != null){
			return (Date)this.createdDate.clone();
		}else{
			return null;
		}
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDateOfBirth() {
		if(this.dateOfBirth != null){
			return (Date)this.dateOfBirth.clone();
		}else{
			return null;
		}
	}

	public void setDateOfBirth(Date dateOfBirth) {
		if(dateOfBirth != null){
			this.dateOfBirth = dateOfBirth;
		}
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserContact getUserContact() {
		return this.userContact;
}

	public void setUserContact(UserContact userContact) {
		this.userContact = userContact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public float getMiles() {
		return miles;
	}

	public void setMiles(float miles) {
		this.miles = miles;
	}
	
	
}