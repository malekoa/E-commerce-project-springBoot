package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Customer;
import com.jtspringproject.JtSpringProject.Entity.Item;
import com.jtspringproject.JtSpringProject.Entity.User;
import com.jtspringproject.JtSpringProject.Service.CustomerService;
import com.jtspringproject.JtSpringProject.Controller.CustomerController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class OrderModuleTest {
    
    CustomerService service;
    private Customer customer;
    private Cart cart;
    private Item item;
    private Item item2;
    private Item item3;

    void moduleTest() {

        service = new CustomerService();
        List<Item> itemList = new ArrayList<>();
        cart = new Cart("1", itemList);
        customer = new Customer(1, "1", "1", "John Doe", "johndoe@email.com", "1", 1, 20);
        item = new Item("1", "1", 100, "4", null, 1);
        item2 = new Item("2", "2", 150, "4", null, 1);
        item3 = new Item("3", "3", 40, "4", null, 1);

        System.out.println(service.addToCart(customer.getId(), Integer.parseInt(item.getItemId()), 1));
        System.out.println(service.addToCart(customer.getId(), Integer.parseInt(item2.getItemId()), 1));
        System.out.println(service.addToCart(customer.getId(), Integer.parseInt(item3.getItemId()), 1));

        cart.checkout();

        // This test is not done but work on the controller/service needs to be done for this to work properly

    }
}