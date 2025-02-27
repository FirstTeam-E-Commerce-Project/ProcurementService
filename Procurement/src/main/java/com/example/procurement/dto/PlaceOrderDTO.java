package com.example.procurement.dto;

import java.util.Date;

public class PlaceOrderDTO {
    private String productId;
    private Double totalAmount;
    private Integer quantityOrdered;
    private Date deliveryDate;

    public PlaceOrderDTO(){}
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Integer quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public PlaceOrderDTO(String productId, Double totalAmount, Integer quantityOrdered, Date deliveryDate) {
        this.productId = productId;
        this.totalAmount = totalAmount;
        this.quantityOrdered = quantityOrdered;
        this.deliveryDate = deliveryDate;
    }
}
