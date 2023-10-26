package com.workintech.s18d4.util;

import java.util.ArrayList;
import java.util.List;

import com.workintech.s18d4.dto.CustomerResponse;
import com.workintech.s18d4.entity.Customer;

public class EntityConverter {
    
    public static CustomerResponse getResponse(Customer customer){
        return new CustomerResponse(customer.getId(), customer.getFirstName(), customer.getLastName());
    }

    public static List<CustomerResponse> getResponses(List<Customer> customers){
        List<CustomerResponse> responseList = new ArrayList<>();
        for(Customer customer: customers){
            responseList.add(new CustomerResponse(customer.getId(), customer.getFirstName(), customer.getLastName()));
        }
        return responseList;
    }
}
