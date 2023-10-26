package com.workintech.s18d4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workintech.s18d4.dao.AddressRepository;
import com.workintech.s18d4.entity.Address;

@Service
public class AddressServiceImpl implements AddressService{
    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    @Override
    public Address findById(long id) {
        Optional<Address> optAdress = addressRepository.findById(id);
        if(optAdress.isPresent()){
            return optAdress.get();
        }
        return null;
    }

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address delete(long id) {
        Address found = findById(id);
        addressRepository.deleteById(id);
        return found;
    }


}
