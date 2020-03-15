package com.account.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.Exception.NotSufficientFundException;
import com.account.entities.Account;
import com.account.entities.Transaction;
import com.account.repo.AccountRepo;
import com.account.repo.TransRepo;
import com.account.service.AccountService;

@Service
@Transactional
public class AccServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accRepo;

	@Autowired
	private TransRepo repo1;

	@Override
	public Account createAccount(Account account) {

		return accRepo.save(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		return (List<Account>) accRepo.findAll();
	}

	@Override
	public void transfer(Long fromAccount, Long toAccount, double transactionAmount) {
		Account acc = accRepo.findByAccountNumber(fromAccount);
		if (acc.getBalance() - transactionAmount < 100)
			acc.setBalance(acc.getBalance() - transactionAmount);
		accRepo.save(acc);
		Account account1 = accRepo.findByAccountNumber(toAccount);
		account1.setBalance(account1.getBalance() + transactionAmount);
		accRepo.save(account1);

		Transaction trans = new Transaction(fromAccount, toAccount, transactionAmount, "Approved");
		repo1.save(trans);

	}

	/*@Override
	public void deposit(Long accountNumber, double amount) {
		Account account=accRepo.findByAccountNumber(accountNumber);
		account.setBalance(account.getBalance() + amount);
		/*AccountTransaction acctrans=new AccountTransaction("deposit",amount);
		account.addAccountTransaction(acctrans);
		accRepo.save(account);
		Transaction trans=new Transaction(accountNumber,null,amount,"deposit");
		repo1.save(trans);
		
	}*/

	/*@Override
	public void withdraw(Long accountNumber, double amount) {
		Account account=accRepo.findByAccountNumber(accountNumber);
		if (account.getBalance() - amount < 1000)
			throw new NotSufficientFundException();
		Transaction trans=new Transaction(accountNumber,null,amount,"withdraw");
		repo1.save(trans);
		
	}*/

}
