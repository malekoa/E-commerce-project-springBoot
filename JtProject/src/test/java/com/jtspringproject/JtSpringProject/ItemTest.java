package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Item;
import com.jtspringproject.JtSpringProject.Entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {


    private Item item;


    @BeforeEach
    public void setUp() {
        Product product = new Product(1, "Test Product", 10, 5);
        item = new Item(1, product, null);
    }

    @Test
    public void testGetItemId() {
        Integer itemId = item.getItemId();
        assertNotNull(itemId);
        assertEquals(Integer.valueOf(1), itemId);
    }

    @Test
    public void testGetProduct() {
        Product product = item.getProduct();
        assertNotNull(product);
        assertEquals(Integer.valueOf(1), product.getpId());
        assertEquals("Test Product", product.getpName());
        assertEquals(Double.valueOf(50.0), product.getpPrice());
    }
}