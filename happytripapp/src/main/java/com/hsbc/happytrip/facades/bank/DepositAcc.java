package com.hsbc.happytrip.facades.bank;

public interface DepositAcc extends Account {
	void withdraw();
	void deposit();
	void getBalance();

}
