package com.hsbc.happytrip.models;

import lombok.Data;

@Data
public class Payroll {
	
	
	private int basicSalary;
	private int da;
	private int hra;
	private double professionalTax;
	
	
	
	public Payroll(int basicSalary, int da, int hra, double professionalTax) {
		super();
		this.basicSalary = basicSalary;
		this.da = da;
		this.hra = hra;
		this.professionalTax = professionalTax;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public double getProfessionalTax() {
		return professionalTax;
	}
	public void setProfessionalTax(double professionalTax) {
		this.professionalTax = professionalTax;
	}
	
	
	
	

}
