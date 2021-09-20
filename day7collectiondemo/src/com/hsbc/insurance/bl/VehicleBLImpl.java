package com.hsbc.insurance.bl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.insurance.dao.VehicleDao;
import com.hsbc.insurance.dao.VehicleImpl;
import com.hsbc.insurance.exceptions.FileCreationException;
import com.hsbc.insurance.exceptions.VehicleCreationException;
import com.hsbc.insurance.exceptions.VehicleRetrievalException;
import com.hsbc.insurance.models.Vehicle;

public class VehicleBLImpl implements VehicleBL {

	private VehicleDao vehicleDao;
	
	public  VehicleBLImpl() throws FileCreationException
	{
		try {
				vehicleDao=new VehicleImpl();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//rethrow
				throw new FileCreationException("Not able to create the "
						+ "file, change the location, Check Permission");				
			}		
	}
	
	
	@Override
	public boolean addVehicle(List<Vehicle> vehicleList) throws VehicleCreationException {
				// TODO Auto-generated method stub
		boolean status=false;
		try {
			status=vehicleDao.addVehicle(vehicleList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new VehicleCreationException("Not able to store it in "
					+ "file check Objects");
		} 
		return status;
	}

	@Override
	public List<Vehicle> getAllVehicles() throws VehicleRetrievalException{
		// TODO Auto-generated method stub
		List<Vehicle> vehicleList=null;
		try {
			vehicleList=vehicleDao.getAllVehicles();
		} catch (IOException|ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new VehicleRetrievalException("Vehicle Object "
					+ "Not found in the file or file Corrupted");
		} 
		
		return vehicleList;
	}

	@Override
	public Vehicle getVehicleByRegNo(String regNo) throws VehicleRetrievalException {
		// TODO Auto-generated method stub
		Vehicle vehicle=null;
		try {
			vehicle=vehicleDao.getVehicleByRegNo(regNo);
		} catch (IOException|ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new VehicleRetrievalException("Vehicle Object "
					+ "Not found in the file or file Corrupted");
		} 
		return vehicle;
	}

}
