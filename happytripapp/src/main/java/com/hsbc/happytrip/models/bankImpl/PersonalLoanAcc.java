package com.hsbc.happytrip.models.bankImpl;

import com.hsbc.happytrip.facades.bank.DebitInterest;
import com.hsbc.happytrip.facades.bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc,DebitInterest{

	@Override
	public void createAcc() {
		System.out.println("Personal Loan Account created");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcInt() {
		System.out.println("Interest Calculated");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deductMonthlyInt() {
		System.out.println("Monthly Interest deducted");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deductHalfYearlyInt() {
		System.out.println("Half yearly Interest deducted");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Annual Interest Deducted");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repayPrincipal() {
		System.out.println("Principal Repayed");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payInterest() {
		System.out.println("Interest Paid");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Partial Principal paid");
		// TODO Auto-generated method stub
		
	}

}
