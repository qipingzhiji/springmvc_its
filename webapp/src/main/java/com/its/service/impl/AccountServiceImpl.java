package com.its.service.impl;

import com.its.dao.account.AccountMapper;
import com.its.entity.account.Account;
import com.its.entity.account.AccountExample;
import com.its.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountMapper accountMapper;

	public List<Account> getAccounts() {
		return accountMapper.selectByExample(new AccountExample());
	}
}
