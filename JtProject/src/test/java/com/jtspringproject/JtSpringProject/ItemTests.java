package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Item;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTests {

    Item item;

    @BeforeEach
    void setUp() {
        item = new Item(1, "1", 3, "4", null, 1);
    }

    @Test
    void testGetName() {
        assertEquals("1", item.getName());
    }

    @Test
    void testGetItemId() {
        assertEquals(1, item.getItemId());
    }

    @Test
    void testGetPrice() {
        assertEquals(3, item.getPrice());
    }

    @Test
    void testGetProvider() {
        assertEquals("4", item.getProvider());
    }

    @Test
    void testGetRecommendedItems() {
        assertNull(item.getRecommendedItems());
    }

    @Test
    void testGetQuantity() {
        assertEquals(1, item.getQuantity());
    }

    @Test
    void testSetName() {
        item.setName("newName");
        assertEquals("newName", item.getName());
    }

    @Test
    void testSetItemId() {
        item.setItemId(2);
        assertEquals(2, item.getItemId());
    }

    @Test
    void testSetPrice() {
        item.setPrice(4);
        assertEquals(4, item.getPrice());
    }

    @Test
    void testSetProvider() {
        item.setProvider("newProvider");
        assertEquals("newProvider", item.getProvider());
    }

    @Test
    void testSetRecommendedItems() {
        List<Item> recommendedList = new ArrayList<>();
        recommendedList.add(new Item(2, "1", 3, "4", null, 1));
        item.setRecommendedItems(recommendedList);
        assertEquals(recommendedList, item.getRecommendedItems());
    }

    @Test
    void testSetQuantity() {
        item.setQuantity(2);
        assertEquals(2, item.getQuantity());
    }

    @Test
    void testToString() {
        String expected = "Item{name='1', itemId='1', price=3.0, provider='4', recommendedItems=null, quantity=1}";
        assertEquals(expected, item.toString());
    }
}