package com.hsbc.happytrip.utilities;

import com.hsbc.happytrip.models.bankImpl.PersonalLoanAcc;
import com.hsbc.happytrip.models.bankImpl.SavingsAcc;
import static com.hsbc.happytrip.facades.bank.Account.*;

import com.hsbc.happytrip.facades.bank.Account;
;public class MyAccount {
	public static void main(String[] args) {
		System.out.println(Account.savings);
		SavingsAcc s=new SavingsAcc();
		s.addAnnualInt();
		s.addHalfYearlyInt();
		s.addMonthlyInt();
		s.calcInt();
		s.createAcc();
		s.deposit();
		s.getBalance();
		s.withdraw();
		/*System.out.println("All The variables that are accessible");
		System.out.println(s.four);
		System.out.println(s.one);
		System.out.println(s.three);
		System.out.println(s.two);
		System.out.println(s.interestFixed);*/
		
		System.out.println("----------------------------------------");
		
		PersonalLoanAcc p= new PersonalLoanAcc();
		p.calcInt();
		p.createAcc();
		p.deductAnnualInt();
		p.deductHalfYearlyInt();
		p.deductMonthlyInt();
		p.payInterest();
		p.payPartialPrincipal();
		p.repayPrincipal();
	}
}
