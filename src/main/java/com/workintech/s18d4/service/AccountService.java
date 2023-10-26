package com.workintech.s18d4.service;

import java.util.List;

import com.workintech.s18d4.entity.Account;

public interface AccountService {
    Account findById(long id);
    Account save(Account address);
    List<Account> findAll();
    Account delete(long id);
}
