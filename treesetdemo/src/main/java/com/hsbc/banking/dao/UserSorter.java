package com.hsbc.banking.dao;

import java.util.Comparator;

import com.hsbc.banking.models.User;

public class UserSorter implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		
		int value=-2;
		if(o1.getAge()>o2.getAge())
			value=1;
		if(o1.getAge()<o2.getAge())
			value=-1;
		if(o1.getAge()==o2.getAge())
			value=0;
	return value;		
	
	
	}

}
