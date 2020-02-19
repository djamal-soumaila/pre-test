package com.priceminister.account;

/**
 * Checks if the requested operation is permitted.
 */
public interface AccountRule {
    
    /**
     * Checks if the resulting account balance after a withdrawal is OK
     * for the specific type of account.
     * @param resultingAccountBalance - the amount resulting of the withdrawal
     * @throws IllegalBalanceException 
     */
    void withdrawPermitted(double resultingAccountBalance) throws IllegalBalanceException;
}
