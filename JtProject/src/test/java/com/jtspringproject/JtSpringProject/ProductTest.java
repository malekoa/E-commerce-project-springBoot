package com.jtspringproject.JtSpringProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import com.jtspringproject.JtSpringProject.Entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product(1, "Test Product", 10, 5);
    }

    @Test
    public void testGetpId() {
        Integer pId = product.getpId();
        assertNotNull(pId);
        assertEquals(Integer.valueOf(1), pId);
    }

    @Test
    public void testGetpName() {
        String pName = product.getpName();
        assertNotNull(pName);
        assertEquals("Test Product", pName);
    }

    @Test
    public void testGetpPrice() {
        int pPrice = product.getpPrice();
        assertEquals(50, pPrice);
    }

    @Test
    public void testGetpQuantity() {
        int pQuantity = product.getpQuantity();
        assertEquals(5, pQuantity);
    }
}