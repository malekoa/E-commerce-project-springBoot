package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Order;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    Order order;

    @BeforeEach
    void setUp() {
        order = new Order(1, 1, 1, "1", null);
    }

    @Test
    void testGetOrderId() {
        assertEquals(1, order.getOrderId());
    }

    @Test
    void testGetCartId() {
        assertEquals(1, order.getCartId());
    }

    @Test
    void testGetUserId() {
        assertEquals(1, order.getUserId());
    }

    @Test
    void testGetTotalCost() {
        assertEquals("1", order.getTotalCost());
    }

    @Test
    void testGetOrderDate() {
        assertNull(order.getOrderDate());
    }

    @Test
    void testSetOrderId() {
        order.setOrderId(2);
        assertEquals(2, order.getOrderId());
    }

    @Test
    void testSetCartId() {
        order.setCartId(2);
        assertEquals(2, order.getCartId());
    }

    @Test
    void testSetUserId() {
        order.setUserId(2);
        assertEquals(2, order.getUserId());
    }

    @Test
    void testSetTotalCost() {
        order.setTotalCost("2");
        assertEquals("2", order.getTotalCost());
    }

    @Test
    void testSetOrderDate() {
        order.setOrderDate("2022-01-01");
        assertEquals("2022-01-01", order.getOrderDate());
    }

    @Test
    void testToString() {
        String expected = "Order{orderId='1', cartId='1', userId='1', totalCost='1', orderDate=null}";
        assertEquals(expected, order.toString());
    }
}
