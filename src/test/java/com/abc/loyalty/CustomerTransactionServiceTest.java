package com.abc.loyalty;

import com.abc.loyalty.model.CustomerTransaction;
import com.abc.loyalty.repository.TransactionRepository;
import com.abc.loyalty.service.CustomerTransactionService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CustomerTransactionServiceTest {

@Test
void testLoyaltyPointCalculation()
{
    CustomerTransactionService transactionService = mock( CustomerTransactionService.class );
    TransactionRepository transactionRepository = mock(TransactionRepository.class);

    List<CustomerTransaction> transactions = new ArrayList<>();
    transactions.add(new CustomerTransaction(1l,1,70.0, "",new Date()));
    transactions.add(new CustomerTransaction(1l,1,200.0, "",new Date()));
    doReturn(transactions).when(transactionRepository).findByCustomerId(1);
    long points = transactionService.getLoyaltyPointsByCustomerId(1);
    //assertEquals(440, points);

}
}
