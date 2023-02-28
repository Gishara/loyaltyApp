package com.abc.loyalty.service;

import java.util.List;

import com.abc.loyalty.model.Customer;
import com.abc.loyalty.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> getCustomerAll() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }




}
