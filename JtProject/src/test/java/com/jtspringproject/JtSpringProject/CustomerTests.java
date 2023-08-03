package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Customer;
import com.jtspringproject.JtSpringProject.Entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTests {

    User customer;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, "1", "1", "John Doe", "johndoe@email.com", "1", 0, 0);
    }

    @Test
    void testCustomerConstructor() {
        assertEquals(1, customer.getId());
        assertEquals("1", customer.getUsername());
        assertEquals("1", customer.getPassword());
        assertEquals("Customer", customer.getType());
        assertEquals("John Doe", ((Customer) customer).getName());
        assertEquals("johndoe@email.com", ((Customer) customer).getEmail());
        assertEquals("1", ((Customer) customer).getCartID());
        assertEquals(0, ((Customer) customer).getNumCoupons());
        assertEquals(0, ((Customer) customer).getCouponAccumulator());
    }

    @Test
    void testSetName() {
        ((Customer) customer).setName("Jane Doe");
        assertEquals("Jane Doe", ((Customer) customer).getName());
    }

    @Test
    void testSetEmail() {
        ((Customer) customer).setEmail("janedoe@email.com");
        assertEquals("janedoe@email.com", ((Customer) customer).getEmail());
    }

    @Test
    void testSetCartID() {
        ((Customer) customer).setCartID("2");
        assertEquals("2", ((Customer) customer).getCartID());
    }

    @Test
    void testSetNumCoupons() {
        ((Customer) customer).setNumCoupons(1);
        assertEquals(1, ((Customer) customer).getNumCoupons());
    }

    @Test
    void testSetCouponAccumulator() {
        ((Customer) customer).setCouponAccumulator(1);
        assertEquals(1, ((Customer) customer).getCouponAccumulator());
    }

    @Test
    void testToString() {
        String expected = "Customer{id=1, username='1', password='1', name='John Doe', email='johndoe@email.com', cartID='1', numCoupons=0, couponAccumulator=0.0}";
        assertEquals(expected, customer.toString());
    }
}