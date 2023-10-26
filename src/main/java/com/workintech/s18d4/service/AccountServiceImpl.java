package com.workintech.s18d4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workintech.s18d4.dao.AccountRepository;
import com.workintech.s18d4.entity.Account;

@Service
public class AccountServiceImpl implements AccountService{

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public Account findById(long id) {
        Optional<Account> optAccount = accountRepository.findById(id);
        if(optAccount.isPresent()){
            return optAccount.get();
        }
        return null;
    }

    @Override
    public Account save(Account address) {
        return accountRepository.save(address);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account delete(long id) {
        Account found = findById(id);
        accountRepository.deleteById(id);
        return found;
    }
    
    
}
