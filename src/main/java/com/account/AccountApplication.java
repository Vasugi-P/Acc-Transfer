package com.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.account.entities.Account;
import com.account.entities.AccountType;
import com.account.repo.AccountRepo;
import com.account.service.AccountService;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner{
	
	@Autowired
	private AccountRepo accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
	
	@Autowired
	private AccountService accountService;

	@Override
	public void run(String... args) throws Exception {
		
		/*Account account = new Account("HG0078", 800.0, true, AccountType.savings);
		accountService.createAccount(account);*/
		
		
	}

}
