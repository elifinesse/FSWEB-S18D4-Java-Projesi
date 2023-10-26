package com.workintech.s18d4.service;

import java.util.List;

import com.workintech.s18d4.entity.Address;

public interface AddressService {
    Address findById(long id);
    Address save(Address address);
    List<Address> findAll();
    Address delete(long id);
}
