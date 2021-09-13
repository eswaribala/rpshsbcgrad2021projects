package com.hsbc.happytrip.models;

import java.io.Serializable;

import java.util.Set;


/**
 * The persistent class for the bookingtypes database table.
 * 
 */

public class BookingType implements Serializable {
	private static final long serialVersionUID = 1L;

	private long typeId;

	private String title;

	//bi-directional many-to-one association to Booking

	private Set<Booking> bookings;

    public BookingType() {
    }

	public long getTypeId() {
		return this.typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}
	
}