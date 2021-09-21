package com.hsbc.retail.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBHelper {
	
	private static ResourceBundle resourceBundle;		
	//singleton dp
	public static Connection getConnection() throws SQLException
	{
		resourceBundle=ResourceBundle.getBundle("com/hsbc/retail/resources/db");
		String url=resourceBundle.getString("url");
		String userName=resourceBundle.getString("username");
		String password=resourceBundle.getString("password");
		return DriverManager.getConnection(url,userName,password);
		
	}

}
