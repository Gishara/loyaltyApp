package com.abc.loyalty.repository;

import com.abc.loyalty.model.CustomerTransaction;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories("com.abc.loyalty.model.*")
@EntityScan("com.abc.loyalty.model.*")
public interface TransactionRepository extends JpaRepository<CustomerTransaction, Integer> {
    @Query("SELECT t FROM CustomerTransaction t WHERE t.customerId = ?1")
    List<CustomerTransaction> findByCustomerId(Integer customerId);
}
