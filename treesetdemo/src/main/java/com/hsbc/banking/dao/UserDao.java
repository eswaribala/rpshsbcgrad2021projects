package com.hsbc.banking.dao;

import java.util.TreeSet;

import com.hsbc.banking.exceptions.AgeException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.User;
//User CRUD operation
public interface UserDao {

	boolean addUser(User user) throws UserNameException,AgeException;
	TreeSet<User> getAllUsers();
}
