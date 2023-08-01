package com.jtspringproject.JtSpringProject.controller;

import java.util.Date;

public class Order {
    private String orderId;

    private String cartId;

    private String userId;

    private String totalCost;

    private Date orderDate;

    public Order() {
        super();
    }

    public Order(String orderId, String cartId, String userId, String totalCost, Date orderDate) {
        super();
        this.orderId = orderId;
        this.cartId = cartId;
        this.userId = userId;
        this.totalCost = totalCost;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId=orderId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId=cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId=userId;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost=totalCost;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate=orderDate;
    }



}
