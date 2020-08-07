package com.its.controller;

import com.its.entity.account.Account;
import com.its.service.AccountService;
import com.its.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhanght
 */
@RestController
public class TestController {

	@Autowired
	private AccountService  accountService;

	@GetMapping(value = "test")
	public String test() {
		return "test success";
	}

	@GetMapping(value = "accounts")
	public List<Account> getAccounts() {
		return accountService.getAccounts();
	}

	@GetMapping("exc")
	public void testException() throws ArithmeticException{
		int i = 1/0;
	}
}
