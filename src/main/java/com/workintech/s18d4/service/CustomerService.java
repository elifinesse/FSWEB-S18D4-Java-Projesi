package com.workintech.s18d4.service;

import java.util.List;

import com.workintech.s18d4.entity.Customer;



public interface CustomerService {
    Customer findById(long id);
    Customer save(Customer address);
    List<Customer> findAll();
    Customer delete(long id);
}
