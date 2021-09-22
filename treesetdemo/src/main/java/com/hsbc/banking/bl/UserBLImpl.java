package com.hsbc.banking.bl;

import java.util.TreeSet;

import com.hsbc.banking.dao.UserDao;
import com.hsbc.banking.dao.UserImpl;
import com.hsbc.banking.exceptions.AgeException;
import com.hsbc.banking.exceptions.UserException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.User;

public class UserBLImpl implements UserBL {

	private UserDao userDao,userDao1;
	
	public UserBLImpl()
	{
		userDao=new UserImpl();
		//userDao1=new UserImpl(size);
	}
	
	//exception wrapper
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try {
			return this.userDao.addUser(user);
		} catch (UserNameException|AgeException e) {
			// TODO Auto-generated catch block
			throw new UserException("User Exception Occurred"+e.getMessage());
		} 
	}

	@Override
	public TreeSet<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

}
