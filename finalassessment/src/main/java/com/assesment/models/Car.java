package com.assesment.models;

/*
 * Car :
! Car model name (unique identifier)
! Seating capacity
 */
public class Car implements Comparable<Car> {

	String carModelName;
	int seatingCapacity;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String carModelName, int seatingCapacity) {
		super();
		this.carModelName = carModelName;
		this.seatingCapacity = seatingCapacity;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Car [carModelName=" + carModelName + ", seatingCapacity=" + seatingCapacity + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int compareTo(Car car) {
		// TODO Auto-generated method stub
		return this.getCarModelName().compareTo(car.getCarModelName());
	}
	
	
	
}
