package com.bank.service;

import org.springframework.stereotype.Service;

import com.bank.entity.Account;
import com.bank.repository.AccountRepository;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public String deposit(String uid, String am) {
        return accountRepository.deposit(uid, am);
    }

    public Account readAccount(String uid) {
        return accountRepository.readAccount(uid);
    }
}

