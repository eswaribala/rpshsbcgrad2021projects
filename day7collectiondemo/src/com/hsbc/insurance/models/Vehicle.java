package com.hsbc.insurance.models;

import java.io.Serializable;
import java.time.LocalDate;

public class Vehicle implements Serializable{
	private String registrationNo;
	private String maker;
	private LocalDate dor;
	private String chassisNo;
	private String engineNo;
	private Fuel fuelType;
	private String color;
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public Fuel getFuelType() {
		return fuelType;
	}
	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", maker=" + maker + ", dor=" + dor + ", chassisNo="
				+ chassisNo + ", engineNo=" + engineNo + ", fuelType=" + fuelType + ", color=" + color + "]";
	}
	
	
	
}
