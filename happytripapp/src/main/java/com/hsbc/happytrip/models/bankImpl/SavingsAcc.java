package com.hsbc.happytrip.models.bankImpl;

import com.hsbc.happytrip.facades.bank.CreditInterest;
import com.hsbc.happytrip.facades.bank.DepositAcc;

public class SavingsAcc implements DepositAcc,CreditInterest {

	@Override
	public void createAcc() {
		
		System.out.println(" Savings Account Created");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcInt() {
		System.out.println("Interest Calculated");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Monthly Interest Added");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addHalfYearlyInt() {
		System.out.println("Half Yearly Interest Added");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAnnualInt() {
		System.out.println("Annual Interest Added");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		System.out.println("Amount Withdrawn");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		System.out.println("Amount Deposited");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBalance() {
		System.out.println("Balance");
		// TODO Auto-generated method stub
		
	}

}
