package com.hsbc.insurance.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

import com.hsbc.insurance.bl.VehicleBL;
import com.hsbc.insurance.bl.VehicleBLImpl;
import com.hsbc.insurance.bl.VehicleSorter;
import com.hsbc.insurance.exceptions.FileCreationException;
import com.hsbc.insurance.exceptions.VehicleCreationException;
import com.hsbc.insurance.exceptions.VehicleRetrievalException;
import com.hsbc.insurance.models.Fuel;
import com.hsbc.insurance.models.Vehicle;

public class VehicleApp {

	private static VehicleBL vehicleBL;	
	static
	{
		try {
			vehicleBL=new VehicleBLImpl();
		} catch (FileCreationException e) {
			//Business specific Exception
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	private static void addVehicles()
	{
		//apply diamond operator
		ArrayList<Vehicle> vehicleList=new ArrayList<>();
		vehicleList.ensureCapacity(100);
		Vehicle vehicle=null;		
		for(int i=0;i<100;i++)
		{
			vehicle=new Vehicle();
			vehicle.setRegistrationNo("TN-02"+new Random().nextInt(10000));
			vehicle.setChassisNo("AH"+new Random().nextInt(100000));
			vehicle.setEngineNo("HY"+new Random().nextInt(100000));
			vehicle.setMaker("Hyundai");
			vehicle.setDor(LocalDate.of(2000+new Random().nextInt(19)+1, 
					new Random().nextInt(10)+1, new Random().nextInt(27)+1));
			vehicle.setColor("Blue");
			vehicle.setFuelType(Fuel.PETROL);
		    vehicleList.add(vehicle);	  
		}
		
		try {
			System.out.println(vehicleBL.addVehicle(vehicleList));
		} catch (VehicleCreationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	private static void getAllVehicles()
	{
		List<Vehicle> vehicleList=null;
		try {
			
			vehicleList=vehicleBL.getAllVehicles();
			System.out.println("Before Sorting....");
			for(Vehicle vehicle: vehicleList)
			{
				System.out.println(vehicle);
			}
			
			//sorting
			Collections.sort(vehicleList,new VehicleSorter());
			System.out.println("After Sorting....");
			for(Vehicle vehicle: vehicleList)
			{
				System.out.println(vehicle);
			}
			
		} catch (VehicleRetrievalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sortVehiclesByPQ()
	{
		PriorityQueue<Vehicle> pq=new PriorityQueue<Vehicle>(new VehicleSorter());		
		
		try {
			for(Vehicle vehicle: vehicleBL.getAllVehicles())
			{
				pq.offer(vehicle);
			}
		} catch (VehicleRetrievalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After Sorting....");
		
		while(!pq.isEmpty())
			System.out.println(pq.poll());
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //addVehicles();   
		getAllVehicles();
		//sortVehiclesByPQ();
	}

}
