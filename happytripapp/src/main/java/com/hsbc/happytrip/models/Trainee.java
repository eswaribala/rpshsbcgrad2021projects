package com.hsbc.happytrip.models;

import lombok.Data;

@Data
public class Trainee implements Cloneable {

	private Payroll payroll;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
	
	
	
	

}
