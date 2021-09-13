package com.hsbc.happytrip.models;

import java.util.Date;
import java.util.Set;

public class ScheduledFlight extends FlightRoute {
	
	
	private Set<FlightBooking> bookings;
	
	
	private Date scheduledFlightDate;
	

	private Date scheduledFlightArrivalDate;

	
	private Set<SeatAvailability> availability;
	
	public Set<FlightBooking> getBookings() {
		return bookings;
	}
	public void setBookings(Set<FlightBooking> bookings) {
		this.bookings = bookings;
	}
	public Date getScheduledFlightDate() {
		return this.scheduledFlightDate;
	}
	public void setScheduledFlightDate(Date scheduledFlightDate) {
		this.scheduledFlightDate = scheduledFlightDate;
	}
	public Set<SeatAvailability> getAvailability() {
		return availability;
	}
	public void setAvailability(Set<SeatAvailability> availability) {
		this.availability = availability;
	}
	public Date getScheduledFlightArrivalDate() {
		return scheduledFlightArrivalDate;
	}
	public void setScheduledFlightArrivalDate(Date scheduledFlightArrivalDate) {
		this.scheduledFlightArrivalDate = scheduledFlightArrivalDate;
	}
}
