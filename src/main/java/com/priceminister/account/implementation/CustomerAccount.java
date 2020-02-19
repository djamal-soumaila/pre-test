package com.priceminister.account.implementation;

import com.priceminister.account.*;


public class CustomerAccount implements Account {

	private double balance = 0.0;
	private AccountRule rule;
	
	public CustomerAccount(AccountRule rule) {
		this.rule = rule;
	}
    public void add(double addedAmount) {
    	this.checkAmountGreaterThanZero(addedAmount);
    	this.balance += addedAmount;
    }

    public double getBalance() {
        return this.balance;
    }

    public double withdrawAndReportBalance(double withdrawnAmount) throws IllegalBalanceException {
        this.withdraw(withdrawnAmount);
        return this.getBalance();
    }

    private void withdraw(double withdrawnAmount) throws IllegalBalanceException {
    	this.checkAmountGreaterThanZero(withdrawnAmount);
        this.rule.withdrawPermitted(this.balance - withdrawnAmount);
        this.balance -= withdrawnAmount;
    }
    
    private void checkAmountGreaterThanZero(double amount) {
    	if(amount < 0) throw new IllegalArgumentException("Amount must be greater than zero");
    }
}
