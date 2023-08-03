package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartTests {

    private Cart cart;
    private Item item;
    private Item item2;
    private Item item3;

    @BeforeEach
    void setUp() {
        item = new Item("1", "1", 3, "4", null, 1);
        item2 = new Item("2", "2", 2, "4", null, 1);
        item3 = new Item("3", "3", 1, "4", null, 1);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item2);
        itemList.add(item3);
        cart = new Cart("1", itemList);
    }

    @Test
    void testCartConstructor() {
        assertEquals("1", cart.getCartId());
        assertNotNull(cart.getContainedItems());
        assertEquals(3, cart.getContainedItems().size());
        assertEquals("1", cart.getContainedItems().get(0).getName());
        assertEquals("2", cart.getContainedItems().get(1).getName());
        assertEquals("3", cart.getContainedItems().get(2).getName());
    }

    @Test
    void testAddItem() {
        Item item4 = new Item("4", "4", 4, "4", null, 1);
        cart.addItem(item4);
        assertEquals(4, cart.getContainedItems().size());
        assertEquals("4", cart.getContainedItems().get(3).getName());
    }

    @Test
    void testRemoveItem() {
        Item item4 = new Item("4", "4", 4, "4", null, 1);
        cart.addItem(item4);
        cart.removeItem(item4);
        assertEquals(3, cart.getContainedItems().size());
        assertEquals("1", cart.getContainedItems().get(0).getName());
        assertEquals("2", cart.getContainedItems().get(1).getName());
        assertEquals("3", cart.getContainedItems().get(2).getName());
    }

    @Test
    void testGetTotalPrice() {
        assertEquals(6, cart.getTotalPrice());
    }

    @Test
    void testClearCart() {
        cart.clearCart();
        assertEquals(0, cart.getContainedItems().size());
    }
}