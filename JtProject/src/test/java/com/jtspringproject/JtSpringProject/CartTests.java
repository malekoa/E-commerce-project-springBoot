package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTests {

    private Cart cart;
    private Item item1;
    private Item item2;

    @BeforeEach
    public void setUp() {
        cart = new Cart(1, new ArrayList<>());
        item1 = new Item(1, 3);
        item2 = new Item(2, 5);
    }

    @Test
    void testGetCartId() {
        assertEquals(1, cart.getCartId());
    }

    @Test
    void testGetContainedItems() {
        List<Item> expected = new ArrayList<>();
        assertEquals(expected, cart.getContainedItems());
    }

    @Test
    void testSetCartId() {
        cart.setCartId(2);
        assertEquals(2, cart.getCartId());
    }

    @Test
    void testSetContainedItems() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        cart.setContainedItems(itemList);
        assertEquals(itemList, cart.getContainedItems());
    }

    @Test
    void testAddItem() {
        cart.addItem(item1);
        List<Item> expected = new ArrayList<>();
        expected.add(item1);
        assertEquals(expected, cart.getContainedItems());
    }

    @Test
    void testRemoveItem() {
        cart.addItem(item1);
        cart.addItem(item2);
        cart.removeItem(item1);
        List<Item> expected = new ArrayList<>();
        expected.add(item2);
        assertEquals(expected, cart.getContainedItems());
    }

    @Test
    void testClearCart() {
        cart.addItem(item1);
        cart.addItem(item2);
        cart.clearCart();
        List<Item> expected = new ArrayList<>();
        assertEquals(expected, cart.getContainedItems());
    }
}