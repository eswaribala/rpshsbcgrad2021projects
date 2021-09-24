package com.assesment.daoLayer;

import java.util.ArrayList;

import com.assesment.exceptions.CarAverageFeedbackException;
import com.assesment.models.AverageFeedbackOutput;
import com.assesment.models.Car;
import com.assesment.models.CustomerFeedback;
/*
 * Datastore layer stores the details of customer’s feedback in a single class using collection framework
data structures 
 */
public interface Feedbackdao {

	boolean addCar(Car c);
	boolean addFeedback(CustomerFeedback cf);
	ArrayList<AverageFeedbackOutput> showAverageFeedbacks() throws CarAverageFeedbackException;
	
	
}
