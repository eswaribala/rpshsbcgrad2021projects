package com.hsbc.insurance.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.insurance.models.Vehicle;

public interface VehicleDao {

	boolean addVehicle(List<Vehicle> vehicleList) throws FileNotFoundException, IOException;
	List<Vehicle> getAllVehicles() throws FileNotFoundException, IOException, ClassNotFoundException;
	Vehicle getVehicleByRegNo(String regNo) throws FileNotFoundException, IOException, ClassNotFoundException;
}
