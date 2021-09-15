package com.hsbc.happytrip.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

import com.hsbc.happytrip.models.Airline;
import com.hsbc.happytrip.models.FlighClassComparer;
import com.hsbc.happytrip.models.FlightClass;
import com.hsbc.happytrip.models.GenderType;
import com.hsbc.happytrip.models.Person;
import com.hsbc.happytrip.models.User;

public class AirlineApp {

	public static void main(String[] args) {
		//Person person=new User(12314,new Date(121,2,2),"user1@gmail.com","user1","test@123",true,null,null,0.0f);
		
		//User user=(User) new Person();
	    
	   
	
		
		//Person person=new Person();
		// TODO Auto-generated method stub
		/*
		TreeMap<Long,FlightClass> flightClasses=new TreeMap<Long,FlightClass>();
		Scanner scanner=new Scanner(System.in);
		 FlightClass flightClass=null;
	       for(int i=0;i<5;i++) {
	    	   flightClass=new FlightClass();
	    	   flightClass.setClassId(new Random().nextInt(10));
	    	   System.out.println("Enter Flight Class");
	    	   flightClass.setClassType(scanner.nextLine());
	    	   flightClasses.put(flightClass.getClassId(), flightClass);
	       }
	       
	     //print
	       System.out.println("Before Sorting.....");
	     Iterator itr=  flightClasses.entrySet().iterator();
	     Map.Entry<Long, FlightClass> entry=null;
	       while(itr.hasNext()) {
	    	   entry=(Entry<Long, FlightClass>) itr.next();
	    	   System.out.println(entry.getKey()+","+entry.getValue().getClassType());
	       }
	       */
		
		
		List<FlightClass> flightClasses=new ArrayList<FlightClass>();	
		
       FlightClass flightClass=null;
       Scanner scanner=new Scanner(System.in);
		
       for(int i=0;i<5;i++) {
    	   flightClass=new FlightClass();
    	   flightClass.setClassId(new Random().nextInt(10));
    	   System.out.println("Enter Flight Class");
    	   flightClass.setClassType(scanner.nextLine());
    	   flightClasses.add(flightClass);
       }
	 
       //print
       System.out.println("Before Sorting.....");
       for(FlightClass fclass: flightClasses) {
    	   System.out.println(fclass.getClassType());
       }
	  //sort classes in alphabetical order by class type
	  Collections.sort(flightClasses,new FlighClassComparer());
	//print
	   System.out.println("After Sorting.....");
      for(FlightClass fclass: flightClasses) {
   	   System.out.println(fclass.getClassType());
      }
	  
	

	}
}
