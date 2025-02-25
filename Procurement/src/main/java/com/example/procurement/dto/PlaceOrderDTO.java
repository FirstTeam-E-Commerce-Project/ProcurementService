package com.example.procurement.dto;

import java.util.Date;

public class PlaceOrderDTO {
    private String productId;
    private String supplierId;
    private Double totalAmount;
    private Integer quantityOrdered;
    private Date deliveryDate;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
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

    public PlaceOrderDTO(String productId, String supplierId, Double totalAmount, Integer quantityOrdered, Date deliveryDate) {
        this.productId = productId;
        this.supplierId = supplierId;
        this.totalAmount = totalAmount;
        this.quantityOrdered = quantityOrdered;
        this.deliveryDate = deliveryDate;
    }
}
