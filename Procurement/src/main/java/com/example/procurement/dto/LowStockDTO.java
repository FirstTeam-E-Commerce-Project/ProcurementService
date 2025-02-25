package com.example.procurement.dto;

public class LowStockDTO {
    private String productName;
    private String productId;
    private Integer quantityInStock;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LowStockDTO(String productName, String productId, Integer quantityInStock) {
        this.productName = productName;
        this.productId = productId;
        this.quantityInStock = quantityInStock;
    }
}
