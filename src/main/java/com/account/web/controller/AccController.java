package com.account.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.entities.Account;
import com.account.entities.Transaction;
import com.account.formbean.AccountForm;
import com.account.formbean.MoneyForm;
import com.account.formbean.TransferForm;
import com.account.service.AccountService;
import com.account.service.TransactionService;

@RestController
public class AccController {
	
	@Autowired
	private AccountService as;
	
	@Autowired
	private TransactionService ts;
	
	@GetMapping(path = "acc")
	public List<Account> getAllAccount() {
		return as.getAllAccounts();
	}
	
	@GetMapping(path = "trans")
	public List<Transaction>getAllTransaction(){
		return ts.getAllTransaction();
	}
	
	@PostMapping(path="create")
	public ResponseEntity<Account>createAccount(@RequestBody AccountForm accForm){
		Account account=new Account(accForm.getIsfc(),accForm.getBalance(),accForm.isActive(),accForm.getAccount());
		return new ResponseEntity<Account>(as.createAccount(account), HttpStatus.ACCEPTED);
	}
	
	@PostMapping(path="transfer")
	public ResponseEntity<Account>transfer(@RequestBody TransferForm form){
		as.transfer(form.getFromAccount(),form.getToAccount(),form.getTransactionAmount());
		return new ResponseEntity<Account>(HttpStatus.OK);
	}
	
	/* @PostMapping(path="withdraw")
	  public ResponseEntity<Account>withdraw(@RequestBody MoneyForm moneyForm){
		  as.withdraw(moneyForm.getFromAccount(),moneyForm.getAmount());
		  return new ResponseEntity<Account>(HttpStatus.OK);
	  }
	  @PostMapping(path="deposit")
	  public ResponseEntity<Account>deposit(@RequestBody MoneyForm moneyForm){
		  as.deposit(moneyForm.getFromAccount(),moneyForm.getAmount());
		  return new ResponseEntity<Account>(HttpStatus.OK);*/


	
	
	

}
