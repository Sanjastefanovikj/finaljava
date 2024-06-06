package com.example.finaljava;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public Order() {
    }

    public Order(Long id, String orderNumber, Date date, Customer customer) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.date = date;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", orderNumber=" + orderNumber + ", date=" + date + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



}
