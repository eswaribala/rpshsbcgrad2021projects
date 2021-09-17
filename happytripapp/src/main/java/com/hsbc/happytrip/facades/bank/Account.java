package com.hsbc.happytrip.facades.bank;

public interface Account {
	//AccountType accountType=AccountType.savings;
	String savings="0";
	String personalLoan="1";
	String fixed="2";
	String housingLoan="3";
	public void createAcc();
}
