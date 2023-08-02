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
}
