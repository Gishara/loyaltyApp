package com.abc.loyalty.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class CustomerTransaction {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "customer_id")
    private long customerId;
    private Double total;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date saveDate;


    public CustomerTransaction() {
        super();
    }
    public CustomerTransaction(Long id, long customerId, Double total, String description, Date date) {
        super();
        this.id = id;
        this.customerId = customerId;
        this.total = total;
        this.description = description;
        this.saveDate = date;
    }

    public Date getSaveDate() {
        return saveDate;
    }
    public void setSaveDate(Date saveDate) {
        this.saveDate = saveDate;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getCustomerId() {
        return customerId;
    }
    public void setCustomer(long customerId) {
        this.customerId = customerId;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}

