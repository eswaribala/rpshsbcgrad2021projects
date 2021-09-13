package com.hsbc.happytrip.models;

import java.io.Serializable;



/**
 * The persistent class for the flightroutecosts database table.
 * 
 */

public class FlightRouteCost implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private long flightRouteCostId;

	
	private float costPerTicket;

	//bi-directional many-to-one association to Class
   
	private FlightClass flightClass;

	//bi-directional many-to-one association to Flightroute
   
	private FlightRoute flightRoute;

    public FlightRouteCost() {
    }

	public long getFlightRouteCostId() {
		return this.flightRouteCostId;
	}

	public void setFlightRouteCostId(long flightRouteCostId) {
		this.flightRouteCostId = flightRouteCostId;
	}

	public float getCostPerTicket() {
		return this.costPerTicket;
	}

	public void setCostPerTicket(float costPerTicket) {
		this.costPerTicket = costPerTicket;
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

	public void setFlightRoute(FlightRoute flightroute) {
		this.flightRoute = flightroute;
	}
	
}