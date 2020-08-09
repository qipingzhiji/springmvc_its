package com.its.controller;

import com.its.dao.AccountDao;
import com.its.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
	@Autowired
	private AccountDao accountDao;

	@GetMapping("accounts")
	public List<AccountEntity> getAccounts() {
		return accountDao.findAll();
	}

	@GetMapping(value = "test")
	public String test() {
		return "hello world";
	}
}
