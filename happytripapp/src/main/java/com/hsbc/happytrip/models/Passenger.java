package com.hsbc.happytrip.models;

import java.io.Serializable;

import java.util.Date;


/**
 * The persistent class for the passengers database table.
 * 
 */

public class Passenger extends Person implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private long passengerId;

	
	private String title;
		
 
	
	private FlightBooking flightBooking;

    public Passenger() {
    }

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

	
}