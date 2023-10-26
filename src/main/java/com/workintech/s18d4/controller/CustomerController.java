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

import com.workintech.s18d4.dto.CustomerResponse;
import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.service.CustomerService;
import com.workintech.s18d4.util.EntityConverter;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping("/")
    public CustomerResponse save(@RequestBody Customer customer){
        return EntityConverter.getResponse(customerService.save(customer));
    }

    @GetMapping("/")
    public List<CustomerResponse> findAll(){
        return EntityConverter.getResponses(customerService.findAll());
    }

    @GetMapping("/{id}")
    public CustomerResponse findById(@PathVariable long id){
        return EntityConverter.getResponse(customerService.findById(id));
    }

    @DeleteMapping("/{id}")
    public CustomerResponse deleteById(@PathVariable long id){
        return EntityConverter.getResponse(customerService.delete(id));
    }

}
