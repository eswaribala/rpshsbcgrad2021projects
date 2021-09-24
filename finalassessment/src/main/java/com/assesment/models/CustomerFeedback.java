package com.assesment.models;
/*
 * Customer Feedback:
! Car model name
! Customer name
! Customer City
! Seating comfort rating (Scale 1 to 5. 1 is poor and 5 is excellent)
! Driving comfort rating (Scale 1 to 5. 1 is poor and 5 is excellent)
 */
public class CustomerFeedback implements Comparable<CustomerFeedback>{

	
	String carModelName;
	String customerName;
	String customerCity;
	int seatingComfortRating;
	int drivingComfortRating;
	public CustomerFeedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerFeedback(String carModelName, String customerName, String customerCity, int seatingComfortRating,
			int drivingComfortRating) {
		super();
		this.carModelName = carModelName;
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.seatingComfortRating = seatingComfortRating;
		this.drivingComfortRating = drivingComfortRating;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public int getSeatingComfortRating() {
		return seatingComfortRating;
	}
	public void setSeatingComfortRating(int seatingComfortRating) {
		this.seatingComfortRating = seatingComfortRating;
	}
	public int getDrivingComfortRating() {
		return drivingComfortRating;
	}
	public void setDrivingComfortRating(int drivingComfortRating) {
		this.drivingComfortRating = drivingComfortRating;
	}
	@Override
	public String toString() {
		return "CustomerFeedback [carModelName=" + carModelName + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", seatingComfortRating=" + seatingComfortRating + ", drivingComfortRating="
				+ drivingComfortRating + "]";
	}
	@Override
	public int compareTo(CustomerFeedback customerFeedback) {
		// TODO Auto-generated method stub
		return this.getCustomerName().compareTo(customerFeedback.getCustomerName());
	}
	
}
