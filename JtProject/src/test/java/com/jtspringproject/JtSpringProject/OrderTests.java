package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Order;
import org.junit.jupiter.api.Test;

public class OrderTests {
    Order order = new Order("1", "1", "1", "1", null);
    @Test
    void orderConstructorTest() {

        assert(order.getOrderId().equals("1"));
        assert(order.getCartId().equals("1"));
        assert(order.getUserId().equals("1"));
        assert(order.getTotalCost().equals("1"));
        assert(order.getOrderDate() == null);
    }
}
