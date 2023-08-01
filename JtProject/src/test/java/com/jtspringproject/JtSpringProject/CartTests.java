package com.jtspringproject.JtSpringProject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CartTests {

    Item item = new Item("1", "1", 3, "4", null);
    Item item2 = new Item("2", "2", 2, "4", null);
    Item item3 = new Item("3", "3", 1, "4", null);
    List<Item> itemList = new ArrayList<>();
    {
        itemList.add(item);
        itemList.add(item2);
        itemList.add(item3);
    }
    Cart cart = new Cart("1", itemList);

    @Test
    void cartConstructorTest() {
        assert(cart.getCartId().equals("1"));
        assert(cart.getContainedItems() != null);
        assert(cart.getContainedItems().size() == 3);
        assert(cart.getContainedItems().get(0).getName().equals("1"));
        assert(cart.getContainedItems().get(1).getName().equals("2"));
        assert(cart.getContainedItems().get(2).getName().equals("3"));
    }

    @Test
    void containedItemsManipulationTest(){
        Item item4 = new Item("4", "4", 4, "4", null);
        cart.addItem(item4);
        assert(cart.getContainedItems().size() == 4);
        assert(cart.getContainedItems().get(3).getName().equals("4"));
        cart.removeItem(item4);
        assert(cart.getContainedItems().size() == 3);
        assert(cart.getContainedItems().get(0).getName().equals("1"));
        assert(cart.getContainedItems().get(1).getName().equals("2"));
        assert(cart.getContainedItems().get(2).getName().equals("3"));

    }
}
