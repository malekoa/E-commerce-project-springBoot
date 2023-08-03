package com.jtspringproject.JtSpringProject.Entity;

import java.util.Date;

public class Order {
    private String orderId;

    private String cartId;

    private String userId;

    private String totalCost;

    private String orderDate;

    public Order() {
        super();
    }

    public Order(String orderId, String cartId, String userId, String totalCost, String orderDate) {
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

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate=orderDate;
    }

    @Override
    public String toString() {
        return "Order{orderId='"+orderId+"', cartId='"+cartId+"', userId='"+userId+"', totalCost='"+totalCost+"', orderDate="+orderDate+"}";
    }



}
