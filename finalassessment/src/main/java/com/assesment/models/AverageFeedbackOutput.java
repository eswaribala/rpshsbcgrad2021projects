package com.assesment.models;
/*
 * Average Customer Feedback = Sum (Feedback per customer) / No of customers provided
feedbacks
 */
public class AverageFeedbackOutput implements Comparable<AverageFeedbackOutput>{
	
	String carModelName;
	int seatingCapacity;
	double avgCustomerRating;
	public AverageFeedbackOutput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AverageFeedbackOutput(String carModelName, int seatingCapacity, double avgCustomerRating) {
		super();
		this.carModelName = carModelName;
		this.seatingCapacity = seatingCapacity;
		this.avgCustomerRating = avgCustomerRating;
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
	public double getAvgCustomerRating() {
		return avgCustomerRating;
	}
	public void setAvgCustomerRating(double avgCustomerRating) {
		this.avgCustomerRating = avgCustomerRating;
	}
	@Override
	public String toString() {
		return "AverageFeedbackOutput [carModelName=" + carModelName + ", seatingCapacity=" + seatingCapacity
				+ ", avgCustomerRating=" + avgCustomerRating + "]";
	}
	@Override
	public int compareTo(AverageFeedbackOutput averageFeedbackOutput) {
		//int val=0;
		if(this.avgCustomerRating>averageFeedbackOutput.avgCustomerRating)
			return -1;
		else if(this.avgCustomerRating<averageFeedbackOutput.avgCustomerRating)
			return 1;
		else 
			return 0;
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
	

}
