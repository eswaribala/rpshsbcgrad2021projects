package com.hsbc.insurance.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.hsbc.insurance.models.Vehicle;

public class VehicleImpl implements VehicleDao {

	private File file;
	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;
	private ObjectOutputStream objectOutputStream;
	private ObjectInputStream objectInputStream;
	
	public VehicleImpl() throws IOException
	{
		file=FileHelper.createFile();
	}
	
	@Override
	public boolean addVehicle(List<Vehicle> vehicleList) throws IOException {
		// TODO Auto-generated method stub
		fileOutputStream=new FileOutputStream(file,true);
		objectOutputStream=new ObjectOutputStream(fileOutputStream);
		for(Vehicle vehicle : vehicleList)
		{
			objectOutputStream.writeObject(vehicle);
		}
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		return true;
	}

	@Override
	public List<Vehicle> getAllVehicles() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);
		List<Vehicle> vehiclesList=new ArrayList<Vehicle>();
		Vehicle vehicle=null;		
		try
		{
			
			while((vehicle=(Vehicle) objectInputStream.readObject())!=null)
			 	vehiclesList.add(vehicle);			
					
		}
		catch(EOFException exception)
		{
			
		}
		finally
		{
		objectInputStream.close();
		fileInputStream.close();
		}
		
		return vehiclesList;
	}

	@Override
	public Vehicle getVehicleByRegNo(String regNo) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		fileInputStream=new FileInputStream(file);
		objectInputStream=new ObjectInputStream(fileInputStream);		
		Vehicle vehicle=null;		
		try
		{
			
			while((vehicle=(Vehicle) objectInputStream.readObject())!=null)
			{
				if(vehicle.getRegistrationNo().equals(regNo))
					break;
			}
					
		}
		catch(EOFException exception)
		{
			
		}
		finally
		{
		objectInputStream.close();
		fileInputStream.close();
		}
		return vehicle;
		
	}

}
