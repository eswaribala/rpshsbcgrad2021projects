package com.hsbc.happytrip.models;

import java.io.Serializable;


/**
 * The persistent class for the routes database table.
 * 
 */

public class Route implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private long routeId;

	//bi-directional many-to-one association to City

	private City toCity;

	//bi-directional many-to-one association to City
 
	private City fromCity;

    public Route() {
    }

	public long getRouteId() {
		return this.routeId;
	}

	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}

	public City getToCity() {
		return this.toCity;
	}

	public void setToCity(City toCity) {
		this.toCity = toCity;
	}
	
	public City getFromCity() {
		return this.fromCity;
	}

	public void setFromCity(City fromCity) {
		this.fromCity = fromCity;
	}
}