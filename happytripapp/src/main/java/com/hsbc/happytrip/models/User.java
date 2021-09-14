package com.hsbc.happytrip.models;

import java.io.Serializable;
import java.rmi.Remote;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * The persistent class for the users database table.
 * 
 */
//is relationship

public class User extends Person implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private long userId;

  
	private Date createdDate;



	
	private String loginId;

	
	private String email;


	private String password;
	
	private boolean enabled;

	//bi-directional one-to-one association to Usercontactinformation
	
	private UserContact userContact;
	

	private List<Role> roles = new ArrayList<Role>();
	

	private float miles;
	
	
	public User(String adharCardNo, FullName name, LocalDate dob, Address address, GenderType gender, long userId,
			Date createdDate, String loginId, String email, String password, boolean enabled, UserContact userContact,
			List<Role> roles, float miles) {
		super(adharCardNo, name, dob, address, gender);
		this.userId = userId;
		this.createdDate = createdDate;
		this.loginId = loginId;
		this.email = email;
		this.password = password;
		this.enabled = enabled;
		this.userContact = userContact;
		this.roles = roles;
		this.miles = miles;
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


	public SpecialMessage writeToLog(int level,String message,boolean active) {
		// TODO Auto-generated method stub
		//file to log
		//return new Message();//downcasting
		return new SpecialMessage(); //upcasting
	}

	@Override
	public Message writeToLog(int level, String message) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}