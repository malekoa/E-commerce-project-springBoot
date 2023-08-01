package com.jtspringproject.JtSpringProject;

import org.junit.jupiter.api.Test;


public class ItemTests {
    @Test
    void itemConstructorTest() {
        Item item = new Item("1", "1", 3, "4", null);
        assert(item.getName().equals("1"));
        assert(item.getItemId().equals("1"));
        assert(item.getProvider().equals("4"));
        assert(item.getPrice() == 3);
        assert (item.getRecommendedItems() == null);
    }

}
