package com.account.service;

import java.util.List;

import com.account.entities.Account;
import com.account.entities.Transaction;

public interface AccountService {
	Account createAccount(Account account);
	
	public List<Account> getAllAccounts();
	
	void transfer(Long fromAccount,Long toAccount,double transactionAmount) ;
	
	
	/*void deposit(Long accountNumber, double amount);
	
    void withdraw(Long accountNumber, double amount);*/

	
}
