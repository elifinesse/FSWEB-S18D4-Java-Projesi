package com.workintech.s18d4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workintech.s18d4.dao.CustomerRepository;
import com.workintech.s18d4.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findById(long id) {
        Optional<Customer> optCustomer = customerRepository.findById(id);
        if(optCustomer.isPresent()){
            return optCustomer.get();
        }
        return null;
    }

    @Override
    public Customer save(Customer address) {
        return customerRepository.save(address);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer delete(long id) {
        Customer found = findById(id);
        customerRepository.deleteById(id);
        return found;
    }
    
}
