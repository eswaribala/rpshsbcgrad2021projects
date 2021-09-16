package com.hsbc.happytrip.utilities;

import com.hsbc.happytrip.facades.BasicPhone;
import com.hsbc.happytrip.facades.Scanner;
import com.hsbc.happytrip.facades.SmartPhone;

import static com.hsbc.happytrip.facades.MobilePhoneStandard.*;
public class TestSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(protocol);
		BasicPhone sPhone=new SmartPhone();
		sPhone.test();
		System.out.println(BasicPhone.getProvider());
		
		//anonymous object
		BasicPhone bPhone=new BasicPhone() {

			@Override
			public void voice() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sms(String text) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		
		
		
	}

}
