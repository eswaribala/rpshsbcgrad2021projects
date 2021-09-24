package com.assesment.daoLayer;

import java.util.ArrayList;

import com.assesment.exceptions.CarAverageFeedbackException;
import com.assesment.models.AverageFeedbackOutput;
import com.assesment.models.Car;
import com.assesment.models.CustomerFeedback;

public class FeedbackdaoIMPL implements Feedbackdao{
	
	private static ArrayList<Car> cars;
	private static ArrayList<CustomerFeedback> customerFeedbacks;
	//private ArrayList<AverageFeedbackOutput> averageFeedbackOutput;
	
	

	public FeedbackdaoIMPL() {
		super();
		cars=new ArrayList<>();
		customerFeedbacks=new ArrayList<>();
		//cars=new ArrayList<>();
	}

	@Override
	public boolean addCar(Car c) {
		boolean bool=true;
		cars.add(c);
		return bool;
	}

	@Override
	public boolean addFeedback(CustomerFeedback cf) {
		boolean bool=true;
		customerFeedbacks.add(cf);
		return bool;
	}

	@Override
	public ArrayList<AverageFeedbackOutput> showAverageFeedbacks() throws CarAverageFeedbackException {
		try {
//		System.out.println(cars);
//		System.out.println(customerFeedbacks);
		ArrayList<AverageFeedbackOutput> averageFeedbacks=new ArrayList<>();
		for(Car car:cars) {
			
			//System.out.println("------");
			
			String carModel=car.getCarModelName();
			int seatCapacity=car.getSeatingCapacity();

			
			//System.out.println(carModel+" "+seatCapacity);
			
			boolean bool=false;
			double countFeedback=0;
			double sumofRatings=0;
			for(CustomerFeedback cf:customerFeedbacks) {
//				System.out.println("--->~~~");
//				System.out.println(cf.getCarModelName());
//				System.out.println("--->~~~");
				if(carModel.equals(cf.getCarModelName())) {
					bool=true;
					//System.out.println("is equal");
					countFeedback++;
					sumofRatings+=(cf.getDrivingComfortRating()+cf.getSeatingComfortRating());
				}
			}
			if(bool==true) {
				double averageRating=sumofRatings/countFeedback;
				averageFeedbacks.add(new AverageFeedbackOutput(carModel,seatCapacity,averageRating));
			}
		}
		
		return averageFeedbacks;
		}
		catch(ArithmeticException|NullPointerException e) {
			throw new CarAverageFeedbackException("Error occurred!!  :-" +e.getMessage()); 
		}
	}

}
