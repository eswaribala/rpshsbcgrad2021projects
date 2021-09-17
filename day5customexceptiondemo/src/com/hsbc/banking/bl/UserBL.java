package com.hsbc.banking.bl;

import com.hsbc.banking.exceptions.AgeException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.User;

public interface UserBL {
	boolean addUser(User user);
	User[] getAllUsers();
}
