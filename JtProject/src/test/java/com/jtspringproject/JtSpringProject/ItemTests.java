package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTests {

    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item(1, 3);
    }

    @Test
    void testGetItemId() {
        assertEquals(1, item.getItemId());
    }

    @Test
    void testGetpId() {
        item.setpId(2);
        assertEquals(2, item.getpId());
    }

    @Test
    void testGetQuantity() {
        assertEquals(3, item.getQuantity());
    }

    @Test
    void testSetItemId() {
        item.setItemId(2);
        assertEquals(2, item.getItemId());
    }

    @Test
    void testSetpId() {
        item.setpId(4);
        assertEquals(4, item.getpId());
    }

    @Test
    void testSetQuantity() {
        item.setQuantity(4);
        assertEquals(4, item.getQuantity());
    }

    @Test
    void testToString() {
        String expected = "Item{, itemId='1', quantity=3}";
        assertEquals(expected, item.toString());
    }
}