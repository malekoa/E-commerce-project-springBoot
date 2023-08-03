package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer orderId;

    private Integer cartId;

    private Integer userId;

    private String totalCost;

    private String orderDate;

    public Order() {
        super();
    }

    public Order(Integer orderId, Integer cartId, Integer userId, String totalCost, String orderDate) {
        super();
        this.orderId = orderId;
        this.cartId = cartId;
        this.userId = userId;
        this.totalCost = totalCost;
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId=orderId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId=cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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
