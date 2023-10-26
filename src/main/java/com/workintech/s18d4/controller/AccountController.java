package com.workintech.s18d4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workintech.s18d4.entity.Account;
import com.workintech.s18d4.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping("/")
    public Account save(@RequestBody Account account){
        return accountService.save(account);
    }

    @GetMapping("/")
    public List<Account> findAll(){
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public Account findById(@PathVariable long id){
        return accountService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Account deleteById(@PathVariable long id){
        return accountService.delete(id);
    }
}
