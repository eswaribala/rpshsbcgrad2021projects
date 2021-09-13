package com.hsbc.happytrip.models;

import java.io.Serializable;


import java.util.Set;


/**
 * The persistent class for the flightroutes database table.
 * 
 */

public class FlightRoute implements Serializable {
	private static final long serialVersionUID = 1L;


	private long flightRouteId;

	private String arrivalTime;

 
	private String departureTime;


	private int distanceInKms;


	private int durationInMins;


	private String flightNumber;
	
	//bi-directional many-to-one association to Flightroutecost

	private Set<FlightRouteCost> flightRouteCosts;

	//bi-directional many-to-one association to Route

	private Route route;

	//bi-directional many-to-one association to Flight

	private Flight flight;

    public FlightRoute() {
    }

    
	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public long getFlightRouteId() {
		return this.flightRouteId;
	}

	public void setFlightRouteId(long flightRouteId) {
		this.flightRouteId = flightRouteId;
	}

	public String getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public int getDistanceInKms() {
		return this.distanceInKms;
	}

	public void setDistanceInKms(int distanceInKms) {
		this.distanceInKms = distanceInKms;
	}

	public int getDurationInMins() {
		return this.durationInMins;
	}

	public void setDurationInMins(int durationInMins) {
		this.durationInMins = durationInMins;
	}

	public Set<FlightRouteCost> getFlightRouteCosts() {
		return this.flightRouteCosts;
	}

	public void setFlightRouteCosts(Set<FlightRouteCost> flightroutecosts) {
		this.flightRouteCosts = flightroutecosts;
	}
	
	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
	public Flight getFlight() {
		return this.flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}