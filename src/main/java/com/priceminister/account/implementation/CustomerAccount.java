package com.priceminister.account.implementation;

import com.priceminister.account.*;


public class CustomerAccount implements Account {

	private double balance = 0.0;
	
    public void add(double addedAmount) {
    	this.balance += addedAmount;
    }

    public double getBalance() {
        return this.balance;
    }

    public Double withdrawAndReportBalance(Double withdrawnAmount, AccountRule rule) 
    		throws IllegalBalanceException {
        // TODO Auto-generated method stub
        return null;
    }

}
