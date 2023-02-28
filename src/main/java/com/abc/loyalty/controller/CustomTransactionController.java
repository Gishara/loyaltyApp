package com.abc.loyalty.controller;

import com.abc.loyalty.service.CustomerTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequestMapping( "/api" )
@RestController
public class CustomTransactionController {
    @Autowired
    private CustomerTransactionService customerTransactionService;


	@GetMapping("/{idUser}/loyaltyPoints")
	public long getById(@PathVariable Integer idUser) {
		return customerTransactionService.getLoyaltyPointsByCustomerId(idUser);
	}

}
