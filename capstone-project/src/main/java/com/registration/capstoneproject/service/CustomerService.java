package com.registration.capstoneproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.capstoneproject.entity.Customer;
import com.registration.capstoneproject.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getCustomers() {
        return repository.findAll();
    }


}
