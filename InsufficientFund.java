package com.core;

public class InsufficientFund extends  Exception{
	
	double amount;
	public InsufficientFund(double amount) {
		this.amount=amount;
	}
	public double getamount() {
		return this.amount;
	}

}
