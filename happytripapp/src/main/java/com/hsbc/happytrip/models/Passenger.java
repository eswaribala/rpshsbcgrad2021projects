package com.hsbc.happytrip.models;

import java.io.Serializable;

import java.util.Date;


/**
 * The persistent class for the passengers database table.
 * 
 */

public class Passenger implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private long passengerId;

	
	private String title;
		
 
	private Date dateOfBirth;

	
	private String gender;


	private String name;

	//bi-directional many-to-one association to Flightbooking
 
	private FlightBooking flightBooking;

    public Passenger() {
    }

	public long getPassengerId() {
		return this.passengerId;
	}

	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
	}

	public Date getDateOfBirth() {
		if(this.dateOfBirth != null){
			return (Date)this.dateOfBirth.clone();
		}else{
			return null;
		}
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FlightBooking getFlightBooking() {
		return this.flightBooking;
	}

	public void setFlightBooking(FlightBooking flightbooking) {
		this.flightBooking = flightbooking;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", title=" + title
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", name=" + name + "]";
	}
}