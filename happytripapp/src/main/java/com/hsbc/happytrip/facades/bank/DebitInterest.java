package com.hsbc.happytrip.facades.bank;

public interface DebitInterest extends Interest {
	
	public void deductMonthlyInt();
	public void deductHalfYearlyInt();
	public void deductAnnualInt();

}
