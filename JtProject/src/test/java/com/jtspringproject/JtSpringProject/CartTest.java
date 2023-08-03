package com.jtspringproject.JtSpringProject;


import java.util.ArrayList;
import java.util.List;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Item;
import com.jtspringproject.JtSpringProject.Entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CartTest {

    private Cart cart;
    private Item item1;
    private Item item2;

    @BeforeEach
    public void setUp() {
        cart = new Cart();
        Product product1 = new Product(1, "Test Product 1", 10, 5);
        Product product2 = new Product(2, "Test Product 2", 20, 3);
        item1 = new Item(1, product1);
        item2 = new Item(2, product2);
    }

    @Test
    public void testGetContainedItems() {
        List<Item> containedItems = cart.getContainedItems();
        assertNotNull(containedItems);
        assertEquals(0, containedItems.size());
    }

    @Test
    public void testSetContainedItems() {
        List<Item> containedItems = new ArrayList<>();
        containedItems.add(item1);
        containedItems.add(item2);
        cart.setContainedItems(containedItems);
        assertEquals(containedItems, cart.getContainedItems());
    }

    @Test
    public void testAddItem() {
        cart.addItem(item1);
        List<Item> containedItems = cart.getContainedItems();
        assertNotNull(containedItems);
        assertEquals(1, containedItems.size());
        assertEquals(item1, containedItems.get(0));
    }

    @Test
    public void testRemoveItem() {
        cart.addItem(item1);
        cart.addItem(item2);
        cart.removeItem(item1);
        List<Item> containedItems = cart.getContainedItems();
        assertNotNull(containedItems);
        assertEquals(1, containedItems.size());
        assertEquals(item2, containedItems.get(0));
    }

    @Test
    public void testGetTotalPrice() {
        cart.addItem(item1);
        cart.addItem(item2);
        float totalPrice = cart.getTotalPrice();
        System.out.println(totalPrice);
        assertEquals(110.0, totalPrice, 0.0);
    }

    @Test
    public void testClearCart() {
        cart.addItem(item1);
        cart.addItem(item2);
        cart.clearCart();
        List<Item> containedItems = cart.getContainedItems();
        assertNotNull(containedItems);
        assertEquals(0, containedItems.size());
    }

    @Test
    public void testCheckout() {
        cart.addItem(item1);
        cart.addItem(item2);
        cart.checkout();
        List<Item> containedItems = cart.getContainedItems();
        assertNotNull(containedItems);
        assertEquals(2, containedItems.size());
    }
}