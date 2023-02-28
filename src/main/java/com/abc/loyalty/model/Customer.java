package com.abc.loyalty.model;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy="customerId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CustomerTransaction> transactions;
    @JsonInclude
    @Transient
    private Long rewardPoints;
    @JsonInclude
    @Transient
    private Double totalPurchases;



    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Customer() {
        super();
    }
    public Customer(Integer id, String firstName, String secondName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }

}

