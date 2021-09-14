package com.hsbc.happytrip.models;

import java.util.Comparator;

public class FlighClassComparer implements Comparator<FlightClass>{

	@Override
	public int compare(FlightClass o1, FlightClass o2) {
		// TODO Auto-generated method stub
		return o1.getClassType().compareTo(o2.getClassType());
	}

}
