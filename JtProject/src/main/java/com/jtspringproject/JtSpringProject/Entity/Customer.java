package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer extends User{
    private String name;
    private String email;
    private String cartID;
    private int numCoupons;
    private double couponAccumulator;
    private Cart cart;  // Added Cart attribute
    
    // Constructors
    public Customer(int id, String username, String password, String name, String email, String cartID, int numCoupons, int couponAccumulator) {
        super(id, username, password, "Customer");
        this.name = name;
        this.email = email;
        this.cartID = cartID;
        this.numCoupons=numCoupons;
        this.couponAccumulator=couponAccumulator;
    }

    public Customer() {
        super();
    }

    // Accessor Methods
    public double getCouponAccumulator() {
        return couponAccumulator;
    }

    public int getNumCoupons() {
        return numCoupons;
    }

    public String getCartID() {
        return cartID;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    // Mutator Methods
    public void setCouponAccumulator(double couponAccumulator) {
        this.couponAccumulator = couponAccumulator;
    }

    public void setNumCoupons(int numCoupons) {
        this.numCoupons = numCoupons;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCart(Cart cart) {  // Added setCart method
        this.cart = cart;
    }

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

}
