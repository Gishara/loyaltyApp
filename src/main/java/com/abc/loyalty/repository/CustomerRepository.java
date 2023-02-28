package com.abc.loyalty.repository;

import com.abc.loyalty.model.Customer;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
@EnableJpaRepositories("com.abc.loyalty.model.*")
@EntityScan("com.abc.loyalty.model.*")
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}

