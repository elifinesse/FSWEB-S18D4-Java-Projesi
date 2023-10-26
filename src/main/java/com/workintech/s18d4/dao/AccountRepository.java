package com.workintech.s18d4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workintech.s18d4.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
