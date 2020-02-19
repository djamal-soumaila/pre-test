package com.priceminister.account.implementation;

import com.priceminister.account.*;


public class CustomerAccount implements Account {

	private double balance = 0.0;
	private AccountRule rule;
	
	public CustomerAccount(AccountRule rule) {
		this.rule = rule;
	}
    public void add(double addedAmount) {
    	this.balance += addedAmount;
    }

    public double getBalance() {
        return this.balance;
    }

    public Double withdrawAndReportBalance(Double withdrawnAmount) throws IllegalBalanceException {
        if(this.rule.withdrawPermitted(this.balance - withdrawnAmount)) {
        	this.balance -= withdrawnAmount;
        }
        else {
        	throw new IllegalBalanceException(this.balance - withdrawnAmount);
        }
        return this.balance;
    }

}
