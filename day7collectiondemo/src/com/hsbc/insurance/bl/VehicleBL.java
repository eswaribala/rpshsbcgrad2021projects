package com.hsbc.insurance.bl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.insurance.exceptions.VehicleCreationException;
import com.hsbc.insurance.exceptions.VehicleRetrievalException;
import com.hsbc.insurance.models.Vehicle;

public interface VehicleBL {
	boolean addVehicle(List<Vehicle> vehicleList) throws VehicleCreationException;
	List<Vehicle> getAllVehicles() throws VehicleRetrievalException; 
	Vehicle getVehicleByRegNo(String regNo) throws VehicleRetrievalException;
}
