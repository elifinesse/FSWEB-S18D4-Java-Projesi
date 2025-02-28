package com.workintech.s18d4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.workintech.s18d4.entity.Address;
import com.workintech.s18d4.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
    private AddressService addressService;
    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @PostMapping("/")
    public Address save(@RequestBody Address address){
        return addressService.save(address);
    }

    @GetMapping("/")
    public List<Address> findAll(){
        return addressService.findAll();
    }
}
