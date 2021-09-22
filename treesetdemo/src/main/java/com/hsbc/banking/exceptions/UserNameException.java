package com.hsbc.banking.exceptions;

//If username has numbers throw U
//checked exception
public class UserNameException extends Exception{

	public UserNameException(String message)
	{
		super(message);
	}
	
}
