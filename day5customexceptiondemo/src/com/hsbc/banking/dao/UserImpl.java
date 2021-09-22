package com.hsbc.banking.dao;

import java.util.regex.Pattern;

import com.hsbc.banking.exceptions.AgeException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.User;

public class UserImpl implements UserDao{

	private User[] userList;
	private static int pos=0;
	
	public UserImpl(int size)
	{
		userList=new User[size];
	}
	
	
	@Override
	public boolean addUser(User user) throws AgeException, UserNameException {
		// TODO Auto-generated method stub
	    boolean status=true;
	    System.out.println(pos);
		if(!Pattern.matches("[a-zA-z]*", user.getUserName()))
		{
		    status=false;
			throw new UserNameException(user.getUserName()+"Name should contain only alphabets");			    
		}
		
		
		if(user.getAge()<0)
		{
			status=false;
			throw new AgeException(user.getAge()+"Age Value should be between 0 to 99"); 
		}
		
		if(status)
		{
			userList[pos]=user;
			//System.out.println(userList[pos]);
			pos++;
		}
		
		
	   return status;
	}

	@Override
	public User[] getAllUsers() {
		// TODO Auto-generated method stub
		return userList;
	}

}
