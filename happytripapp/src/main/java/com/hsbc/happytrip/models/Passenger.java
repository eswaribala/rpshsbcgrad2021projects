package com.hsbc.happytrip.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


/**
 * The persistent class for the passengers database table.
 * 
 */

public class Passenger extends Person implements Serializable {
	public Passenger(String adharCardNo, FullName name, LocalDate dob, Address address, GenderType gender) {
		super(adharCardNo, name, dob, address, gender);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	
	private long passengerId;

	
	private String title;
		
 
	
	private FlightBooking flightBooking;

  
	public long getPassengerId() {
		return this.passengerId;
	}

	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
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
	protected Message writeToLog(int level, String message) {
		// TODO Auto-generated method stub
		return null;
	}

	
}