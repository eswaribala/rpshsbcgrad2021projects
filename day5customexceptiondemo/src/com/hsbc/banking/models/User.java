package com.hsbc.banking.models;

public class User {

	private String userName;
	private byte age;
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public byte getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + "]";
	}
	
}
