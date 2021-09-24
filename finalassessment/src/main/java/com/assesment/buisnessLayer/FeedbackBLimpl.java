package com.assesment.buisnessLayer;

import java.util.ArrayList;

import com.assesment.daoLayer.Feedbackdao;
import com.assesment.daoLayer.FeedbackdaoIMPL;
import com.assesment.exceptions.CarAverageFeedbackException;
import com.assesment.models.AverageFeedbackOutput;
import com.assesment.models.Car;
import com.assesment.models.CustomerFeedback;

public class FeedbackBLimpl implements FeedbackBL{
	
	private Feedbackdao feedbackdao;
	

	public FeedbackBLimpl() {
		super();
		feedbackdao=new FeedbackdaoIMPL();
		
	}

	@Override
	public boolean addCar(Car c) {
		// TODO Auto-generated method stub
		return feedbackdao.addCar(c);
	}

	@Override
	public boolean addFeedback(CustomerFeedback cf) {
		// TODO Auto-generated method stub
		return feedbackdao.addFeedback(cf);
	}

	@Override
	public ArrayList<AverageFeedbackOutput> showAverageFeedbacks() throws CarAverageFeedbackException {
		// TODO Auto-generated method stub
		
			return feedbackdao.showAverageFeedbacks();
		
	}

}
