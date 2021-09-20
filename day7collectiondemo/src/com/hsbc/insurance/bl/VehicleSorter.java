package com.hsbc.insurance.bl;

import java.util.Comparator;

import com.hsbc.insurance.models.Vehicle;

public class VehicleSorter implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.getDor().compareTo(o2.getDor());
	}

}
