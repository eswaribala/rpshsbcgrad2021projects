package com.hsbc.happytrip.utilities;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.happytrip.models.Payroll;
import com.hsbc.happytrip.models.Trainee;

public class TestClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		Trainee trainee=new Trainee();
		
		trainee.setPayroll(new Payroll(26000,13000,15000,0.12));		
		
		//repeat this for 200 trainees
		
      List<Trainee> trainees=new ArrayList<Trainee>();
      trainees.add(trainee);
      for(int i=0;i<200;i++) {
    	
			
				try {
					trainees.add((Trainee) trainee.clone());
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
	
      
	    }
      //print all the objects
      //m1
      for(Trainee traineeObj:trainees) {
    	System.out.println(traineeObj);  
      }
      //m2
      trainees.stream().forEach((e)->{
    	  System.out.println(e);
      });
      
      //m3
      trainees.stream().forEach(System.out::println);
     
    
      
	}
}
