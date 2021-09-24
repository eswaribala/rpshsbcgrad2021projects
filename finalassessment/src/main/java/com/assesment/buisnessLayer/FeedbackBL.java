package com.assesment.buisnessLayer;

import java.util.ArrayList;

import com.assesment.exceptions.CarAverageFeedbackException;
import com.assesment.models.AverageFeedbackOutput;
import com.assesment.models.Car;
import com.assesment.models.CustomerFeedback;

public interface FeedbackBL {
	

	boolean addCar(Car c);
	boolean addFeedback(CustomerFeedback cf);
	ArrayList<AverageFeedbackOutput> showAverageFeedbacks() throws CarAverageFeedbackException;
	

}
