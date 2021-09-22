package com.hsbc.banking.views;

import java.util.Scanner;

import com.hsbc.banking.bl.UserBL;
import com.hsbc.banking.bl.UserBLImpl;
import com.hsbc.banking.dao.UserDao;
import com.hsbc.banking.dao.UserImpl;
import com.hsbc.banking.exceptions.AgeException;
import com.hsbc.banking.exceptions.UserException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.User;

//User App is view layer calls BL Layer
public class UserApp {
   //connect to business layer
	private static UserBL userBL;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		User user=null;
		
		System.out.println("Enter No of Users");
		byte size=scanner.nextByte();
		//asserting the size of the array
		try
		{
		assert(size>0):"Assertion Error Size is not valid";
		
		scanner.nextLine();
		userBL=new UserBLImpl(size);
		
		for(int i=0;i<size;i++)
		{
		try
		{
		//	System.out.println(UserImpl.pos);
			user=new User();
		System.out.println("Enter User Name"+i);
		user.setUserName(scanner.nextLine());
		System.out.println("Enter Age"+i);
		user.setAge(scanner.nextByte());
		scanner.nextLine();				
		userBL.addUser(user);
		} 
		
		catch(NullPointerException exception)
		{
			
			System.out.println(exception.getMessage());
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		}
		
		scanner.close();
		
	}

	catch(AssertionError error)
	{
		System.out.println(error.getMessage());
	}
		
		
		for(User userObj : userBL.getAllUsers()) {
			System.out.println(userObj);
		}
		
	}
}
