package com.priceminister.account;

/**
 * This class represents a simple account.
 * It doesn't handle different currencies, all money is supposed to be of standard currency EUR.
 */
public interface Account {
    
    /**
     * Adds money to this account.
     * @param addedAmount - the money to add
     */
    public void add(double addedAmount);
    
    /**
     * Withdraws money from the account.
     * @param withdrawnAmount - the money to withdraw
     * @return the remaining account balance
     * @throws IllegalBalanceException if the withdrawal leaves the account with a forbidden balance
     */
    public Double withdrawAndReportBalance(Double withdrawnAmount) throws IllegalBalanceException;
    
    /**
     * Gets the current account balance.
     * @return the account's balance
     */
    public double getBalance();
}
