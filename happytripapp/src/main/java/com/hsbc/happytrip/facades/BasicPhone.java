package com.hsbc.happytrip.facades;

public interface BasicPhone {
	
	void voice();
	void sms(String text);
	
	//java 8 onwards
	public default void test() {
		System.out.println("From Default.....");
	}
	
	public static String getProvider() {
		return "Samsung";
	}

}
