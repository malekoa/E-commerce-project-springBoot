package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;
/**
 * The Customer class represents a customer in the system.
 * It extends the User class and adds additional attributes
 * such as name, email, cart ID, number of coupons, and
 * coupon accumulator.
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "Customer")
public class Customer extends User{
    private String name;
    private String email;
    private String cartID;
    private int numCoupons;
    private double couponAccumulator;
    private String address;

    /**
     * Constructs a new Customer object with the specified
     * ID, username, password, name, email, cart ID, number
     * of coupons, and address.
     *
     * @param id the ID of the customer
     * @param username the username of the customer
     * @param password the password of the customer
     * @param name the name of the customer
     * @param email the email of the customer
     * @param cartID the ID of the customer's cart
     * @param numCoupons the number of coupons the customer has
     * @param couponAccumulator the total value of the customer's coupons
     * @param address the address of the customer
     */
    public Customer(int id, String username, String password, String name, String email, String cartID, int numCoupons, int couponAccumulator, String address) {
        super(id, username, password, "Customer");
        this.name = name;
        this.email = email;
        this.cartID = cartID;
        this.numCoupons=numCoupons;
        this.couponAccumulator=couponAccumulator;
        this.address = address;
    }

    /**
     * Constructs a new Customer object with default values.
     */
    public Customer() {
        super();
    }

    /**
     * Returns the total value of the customer's coupons.
     *
     * @return the coupon accumulator
     */
    public double getCouponAccumulator() {
        return couponAccumulator;
    }

    /**
     * Returns the number of coupons the customer has.
     *
     * @return the number of coupons
     */
    public int getNumCoupons() {
        return numCoupons;
    }

    /**
     * Returns the ID of the customer's cart.
     *
     * @return the cart ID
     */
    public String getCartID() {
        return cartID;
    }

    /**
     * Returns the email of the customer.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the name of the customer.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address of the customer.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the customer.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the total value of the customer's coupons.
     *
     * @param couponAccumulator the new coupon accumulator
     */
    public void setCouponAccumulator(double couponAccumulator) {
        this.couponAccumulator = couponAccumulator;
    }

    /**
     * Sets the number of coupons the customer has.
     *
     * @param numCoupons the new number of coupons
     */
    public void setNumCoupons(int numCoupons) {
        this.numCoupons = numCoupons;
    }

    /**
     * Sets the ID of the customer's cart.
     *
     * @param cartID the new cart ID
     */
    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    /**
     * Sets the email of the customer.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the name of the customer.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the customer's cart.
     *
     * @param cart the new cart
     */
    public void setCart(Cart cart) {  // Added setCart method
        // Copies all items from cart and adds them to customer's cart
    }

    /**
     * Returns a string representation of the customer.
     *
     * @return a string representation of the customer
     */
    @Override
    public String toString(){
        return "Customer{" +
                "id=" + super.getId() +
                ", username='" + super.getUsername() + '\'' +
                ", password='" + super.getPassword() + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cartID='" + cartID + '\'' +
                ", numCoupons=" + numCoupons +
                ", couponAccumulator=" + couponAccumulator +
                '}';
    }

    public String getCart() {
        return cartID;
    }
}