package com.hsbc.happytrip.models;

public class FlightInventory {

	private String airlineName;
	private String flightName;
	private String fromCity;
	private String toCity;
	private String departureTime;
	private String arrivalTime;
	private int economyCapacity;
	private int businessCapacity;
	private int economyBooked;
	private int businessBooked;
	private int economyAvailable;
	private int businessAvailable;
	
	
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getEconomyCapacity() {
		return economyCapacity;
	}
	public void setEconomyCapacity(int economyCapacity) {
		this.economyCapacity = economyCapacity;
	}
	public int getBusinessCapacity() {
		return businessCapacity;
	}
	public void setBusinessCapacity(int businessCapacity) {
		this.businessCapacity = businessCapacity;
	}
	public int getEconomyBooked() {
		return economyBooked;
	}
	public void setEconomyBooked(int economyBooked) {
		this.economyBooked = economyBooked;
	}
	public int getBusinessBooked() {
		return businessBooked;
	}
	public void setBusinessBooked(int businessBooked) {
		this.businessBooked = businessBooked;
	}
	public int getEconomyAvailable() {
		return economyAvailable;
	}
	public void setEconomyAvailable(int economyAvailable) {
		this.economyAvailable = economyAvailable;
	}
	public int getBusinessAvailable() {
		return businessAvailable;
	}
	public void setBusinessAvailable(int businessAvailable) {
		this.businessAvailable = businessAvailable;
	}
}
