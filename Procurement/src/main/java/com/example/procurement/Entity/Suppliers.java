package com.example.procurement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String supplierName;
    private String email;
    private String phoneNumber;
    private Double pricePerUnit;

    //default constructor
    public Suppliers() {}

    //all args constructor
    public Suppliers(Integer id, String supplierName, String email, String phoneNumber, Double pricePerUnit) {
        this.id = id;
        this.supplierName = supplierName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pricePerUnit = pricePerUnit;
    }

    //getters and setters
    public Integer getId() {return id;}
    public Double getPricePerUnit() {return pricePerUnit;}
    public void setPricePerUnit(Double pricePerUnit) {this.pricePerUnit = pricePerUnit;}
    public void setId(Integer id) {this.id = id;}
    public String getSupplierName() {return supplierName;}
    public void setSupplierName(String supplierName) {this.supplierName = supplierName;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}


}
