package com.example.procurement.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ProcurementOrder{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String productId;
    private Integer quantity;
    private Double totalAmount;
    private Date orderDate;
    private Date deliveryDate;
    @ManyToOne
    @JoinColumn(name = "suppliers_id")
    private Suppliers suppliers;

    public ProcurementOrder() {}
    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public String getProductId() {return productId;}
    public void setProductId(String productId) {this.productId = productId;}
    public Integer getQuantity() {return quantity;}
    public void setQuantity(Integer quantity) {this.quantity = quantity;}
    public Double getTotalAmount() {return totalAmount;}
    public void setTotalAmount(Double totalAmount) {this.totalAmount = totalAmount;}
    public Date getOrderDate() {return orderDate;}
    public void setOrderDate(Date orderDate) {this.orderDate = orderDate;}
    public Date getDeliveryDate() {return deliveryDate;}
    public void setDeliveryDate(Date deliveryDate) {this.deliveryDate = deliveryDate;}
    public Suppliers getSuppliers() {return suppliers;}
    public void setSuppliers(Suppliers suppliers) {this.suppliers = suppliers;}

    public ProcurementOrder(Integer id, String productId, Integer quantity, Double totalAmount, Date orderDate, Date deliveryDate, Suppliers suppliers) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.suppliers = suppliers;
    }
}
