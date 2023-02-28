package com.abc.loyalty.service;

import com.abc.loyalty.model.CustomerTransaction;
import com.abc.loyalty.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Long calculatePoints(double total) {
        long points = 0l;

        if (total > 50 && total <= 100) {
            points += (total - 50) * 1;

        }

        if (total > 100) {
            points += 50;  //1 point for every ruppee spent over Rs.50
            points += (total - 100) * 2;  //2 points for every dollar spent over 100
        }

        return points;
    }


    public long getLoyaltyPointsByCustomerId(Integer customerId)
    {
        List<CustomerTransaction> transactions = transactionRepository.findByCustomerId(customerId);
        long loyalPoints = 0l;
        for(CustomerTransaction transaction : transactions)
        {
            loyalPoints += calculatePoints(transaction.getTotal());
        }
        return loyalPoints;
    }
}
