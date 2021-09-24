package com.assesment.viewLayer;


import java.util.ArrayList;
import java.util.ResourceBundle;

import com.assesment.buisnessLayer.FeedbackBL;
import com.assesment.buisnessLayer.FeedbackBLimpl;
import com.assesment.exceptions.CarAverageFeedbackException;

import com.assesment.models.AverageFeedbackOutput;
import com.assesment.models.Car;
import com.assesment.models.CustomerFeedback;
/*
 * • Car:
! Car model name: Ford Ecosport, Seating Capacity: 5
! Car model name: Toyota Innova, Seating Capacity: 7
! Car model name: Hyundai i20, Seating Capacity: 5
• Customer Feedback
! Car model name: Ford Ecosport, Customer Name: Mukund, Customer City: Delhi, Seating
comfort rating: 4, Driving comfort rating: 3
! Car model name: Ford Ecosport, Customer Name: Sakshi, Customer City: Vishakapatnam,
Seating comfort rating: 3, Driving comfort rating: 4
! Car model name: Ford Ecosport, Customer Name: Rohit, Customer City: Mumbai, Seating
comfort rating: 4, Driving comfort rating: 4
 */
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reading data from external file
        ResourceBundle rb=ResourceBundle.getBundle("com/assessment/resources/data"); 
        String[] cars=rb.getString("car").split("->");        
        
		FeedbackBL feedBuisnesslayer=new FeedbackBLimpl();
		String[] carData,fbData=null;
		for(String data:cars) {
			carData=data.split(",");
		    feedBuisnesslayer.addCar(new Car(carData[0],Integer.parseInt(carData[1])));
		
		}
		
		String[] custFeedBacks=rb.getString("customerFeedback").split("->");
		for(String data:custFeedBacks) {
			fbData=data.split(",");
		    feedBuisnesslayer.addFeedback(new CustomerFeedback(fbData[0],fbData[1],fbData[2],Integer.parseInt(fbData[3]),Integer.parseInt(fbData[4])));
		}
		try {
			ArrayList<AverageFeedbackOutput> averageFeedbacks=feedBuisnesslayer.showAverageFeedbacks();
//			System.out.println(averageFeedbacks);
			System.out.println("Car Model Name, Seating Capacity, Average Customer Feedback");
			for(AverageFeedbackOutput avgFeedback: averageFeedbacks) {
				System.out.println(avgFeedback.getCarModelName() +", "+avgFeedback.getSeatingCapacity()+", "+avgFeedback.getAvgCustomerRating());
			}
		}
		catch(CarAverageFeedbackException e) {
			System.out.println(e.getMessage());
		}

	}

}
