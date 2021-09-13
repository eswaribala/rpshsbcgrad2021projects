package com.hsbc.happytrip.models;

import java.io.Serializable;

import java.text.ParseException;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the flightbookings database table.
 * 
 */

public class FlightBooking implements Serializable,Comparable<FlightBooking> {
	private static final long serialVersionUID = 1L;

	private long bookingId;

	
	private float costPerTicket;

  
	private Date dateOfJourney;

	private int noOfSeats;
	

	private float miles;
	
	
	private boolean insured=false;
	

	private float insuranceAmount = 0;

	//bi-directional many-to-one association to Class

	private FlightClass flightClass;

	//bi-directional many-to-one association to Flightroute
  
	private FlightRoute flightRoute;

	//bi-directional one-to-one association to Booking

	private Booking booking;

	//bi-directional many-to-one association to Passenger

	private Set<Passenger> passengers;

    public FlightBooking() {
    }

	public long getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public float getCostPerTicket() {
		return this.costPerTicket;
	}

	public void setCostPerTicket(float costPerTicket) {
		this.costPerTicket = costPerTicket;
	}

	public Date getDateOfJourney() {
		if(this.dateOfJourney != null){
			return (Date)this.dateOfJourney.clone();
		}else{
			return null;
		}
	}

	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public int getNoOfSeats() {
		return this.noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public FlightClass getFlightClass() {
		return this.flightClass;
	}

	public void setFlightClass(FlightClass classId) {
		this.flightClass = classId;
	}
	
	public FlightRoute getFlightRoute() {
		return this.flightRoute;
	}

	public void setFlightRoute(FlightRoute flightRoute) {
		this.flightRoute = flightRoute;
	}
	
	public Booking getBooking() {
		return this.booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	public Set<Passenger> getPassengers() {
		return this.passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	public float getMiles() {
		return miles;
	}

	public void setMiles(float miles) {
		this.miles = miles;
	}

	public boolean isInsured() {
		return insured;
	}

	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	
	public float getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(float insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightBooking other = (FlightBooking) obj;
		if (bookingId != other.bookingId)
			return false;
		return true;
	}

	@Override
	public int compareTo(FlightBooking o) {
		// TODO Auto-generated method stub
		Long thisBookingId = this.bookingId;
		Long otherBookingId = o.bookingId;
		return thisBookingId.compareTo(otherBookingId);
	}
	
	
}