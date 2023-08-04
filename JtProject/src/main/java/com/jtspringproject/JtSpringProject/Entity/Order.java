package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;
/**
 * The Order class represents an order entity with its properties like order ID, cart ID, user ID, total cost, and order date.
 * This class is annotated as an entity for JPA (Java Persistence API) to enable ORM (Object-Relational Mapping).
 */
@Entity
@Table(name = "Order")
public class Order {

    /**
     * The primary key of the Order entity.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    /**
     * The ID of the cart associated with the order.
     */
    private Integer cartId;

    /**
     * The ID of the user who placed the order.
     */
    private Integer userId;

    /**
     * The total cost of the order as a string value.
     */
    private String totalCost;

    /**
     * The date of the order as a string value.
     */
    private String orderDate;

    /**
     * Default constructor for the Order class.
     */
    public Order() {
        super();
    }

    /**
     * Parameterized constructor for the Order class.
     *
     * @param orderId   The order ID.
     * @param cartId    The ID of the cart associated with the order.
     * @param userId    The ID of the user who placed the order.
     * @param totalCost The total cost of the order.
     * @param orderDate The date of the order.
     */
    public Order(Integer orderId, Integer cartId, Integer userId, String totalCost, String orderDate) {
        super();
        this.orderId = orderId;
        this.cartId = cartId;
        this.userId = userId;
        this.totalCost = totalCost;
        this.orderDate = orderDate;
    }

    /**
     * Get the order ID.
     *
     * @return The order ID.
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * Set the order ID.
     *
     * @param orderId The order ID to set.
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * Get the cart ID associated with the order.
     *
     * @return The cart ID associated with the order.
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * Set the cart ID associated with the order.
     *
     * @param cartId The cart ID to set.
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**
     * Get the user ID who placed the order.
     *
     * @return The user ID who placed the order.
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set the user ID who placed the order.
     *
     * @param userId The user ID to set.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Get the total cost of the order.
     *
     * @return The total cost of the order.
     */
    public String getTotalCost() {
        return totalCost;
    }

    /**
     * Set the total cost of the order.
     *
     * @param totalCost The total cost of the order to set.
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * Get the date of the order.
     *
     * @return The date of the order.
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Set the date of the order.
     *
     * @param orderDate The date of the order to set.
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", cartId='" + cartId + '\'' +
                ", userId='" + userId + '\'' +
                ", totalCost='" + totalCost + '\'' +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}
