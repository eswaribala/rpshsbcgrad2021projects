package com.hsbc.happytrip.facades.bank;

public interface LoanAcc extends Account {
	void repayPrincipal();
	void payInterest();
	void payPartialPrincipal();
}
