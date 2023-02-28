package com.abc.loyalty.controller;

import java.util.List;

import com.abc.loyalty.model.Customer;
import com.abc.loyalty.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequestMapping( "/api" )
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> findCustomerAll() {
        return customerService.getCustomerAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
        Customer customer = customerService.getCustomerById(id);
        if (customer == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping("/customers")
    public Customer createCustomer( @RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }



}
