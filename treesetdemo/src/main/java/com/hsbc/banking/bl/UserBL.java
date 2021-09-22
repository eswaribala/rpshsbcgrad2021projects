package com.hsbc.banking.bl;

import java.util.TreeSet;

import com.hsbc.banking.exceptions.AgeException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.User;

public interface UserBL  {
	boolean addUser(User user) ;
	TreeSet<User> getAllUsers();
}
