package com.priceminister.account;


import static org.junit.Assert.*;

import org.junit.*;

import com.priceminister.account.implementation.*;


/**
 * Please create the business code, starting from the unit tests below.
 * Implement the first test, the develop the code that makes it pass.
 * Then focus on the second test, and so on.
 * 
 * We want to see how you "think code", and how you organize and structure a simple application.
 * 
 * When you are done, please zip the whole project (incl. source-code) and send it to recrutement-dev@priceminister.com
 * 
 */
public class CustomerAccountTest {
    
    Account customerAccount;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        customerAccount = new CustomerAccount(new CustomerAccountRule());
    }
    
    /**
     * Tests that an empty account always has a balance of 0.0, not a NULL.
     */
    @Test
    public void testAccountWithoutMoneyHasZeroBalance() {
        assertEquals(0.0, customerAccount.getBalance(), 0.0);
    }
    
    /**
     * Adds money to the account and checks that the new balance is as expected.
     */
    @Test
    public void testAddPositiveAmount() {
    	double balance = customerAccount.getBalance();
    	double addedAmount = 15.5;
    	customerAccount.add(addedAmount);
    	assertEquals(balance + addedAmount, customerAccount.getBalance(), 0.0);
    }
    
    /**
     * Tests that an illegal withdrawal throws the expected exception.
     * Use the logic contained in CustomerAccountRule; feel free to refactor the existing code.
     * @throws IllegalBalanceException 
     */
    @Test(expected = IllegalBalanceException.class)
    public void testWithdrawAndReportBalanceIllegalBalance() throws IllegalBalanceException {
    	double balance = customerAccount.getBalance();
    	double withdrawnAmount = balance + 40.1;
    	customerAccount.withdrawAndReportBalance(withdrawnAmount);
    }
    
    // Also implement missing unit tests for the above functionalities.

    /**
	 * Withdraw money to the account and checks that the new balance is as expected.
     * @throws IllegalBalanceException 
     */
    @Test
    public void testWithdrawAndReportBalance() throws IllegalBalanceException {
    	customerAccount.add(100.0);
    	double balance = customerAccount.getBalance();
    	double withdrawnAmount = balance/2;
    	assertEquals(balance / 2, customerAccount.withdrawAndReportBalance(withdrawnAmount), 0.0);
    }
}
