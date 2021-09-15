package com.hsbc.happytrip.utilities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dop=new Date();
		System.out.println(dop.toLocaleString());
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd.MMM.yyyy");
		System.out.println(simpleDateFormat.format(dop));
		
		Calendar dopCalendar=Calendar.getInstance();
		dopCalendar.set(2021, 8, 8);
		System.out.println(dopCalendar.getTime());
		
		//java 8
		
		LocalDate doj=LocalDate.now();
		System.out.println(doj.toString());
		ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		
		//convert given date time into required zone date time
				LocalDateTime currentDateTime=LocalDateTime.now();
				DateTimeFormatter formatter=DateTimeFormatter.ofPattern
						("MMM-dd-yyyy HH:mm:ss:SS");
				System.out.println(currentDateTime.format(formatter));

				ZonedDateTime currentZone = ZonedDateTime.now();  
				 System.out.println("the current zone is "+ 
				                     currentZone.getZone());  
				 
				 ZoneId selectedZoneId=null; 
				for(String zoneId:ZoneId.getAvailableZoneIds())
				{
					selectedZoneId = ZoneId.of(zoneId); 

				 ZonedDateTime selectedZone = 
				         currentZone.withZoneSameInstant(selectedZoneId); 
				                 
				 System.out.println("Selected time zone is " +  
				                     selectedZone); 

				 DateTimeFormatter format =  
				     DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
				   
				 String formatedDateTime = selectedZone.format(format);  

				 System.out.println("formatted selected time zone "+ 
				                     formatedDateTime); 
				}

				
				
	}

}
