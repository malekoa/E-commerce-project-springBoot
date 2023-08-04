package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.*;
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

    private Product product;
    private Product product2;
    private Product product3;

    void moduleTest() {

        service = new CustomerService();
        List<Item> itemList = new ArrayList<>();
        cart = new Cart(1, itemList);
        customer = new Customer(1, "1", "1", "John Doe", "johndoe@email.com", "1", 1, 20, "111 test avenue");

        product = new Product(1, "test product", 100, 5);
        product2 = new Product(2, "test product 2", 150, 3);
        product3 = new Product(3, "test product 3", 40, 2);

        item = new Item(1, product, null);
        item2 = new Item(2, product2, null);
        item3 = new Item(3, product3, null);

//        addToCart does not work right now
//        System.out.println(service.addToCart(customer.getId(), Integer.parseInt(item.getItemId()), 1));
//        System.out.println(service.addToCart(customer.getId(), Integer.parseInt(item2.getItemId()), 1));
//        System.out.println(service.addToCart(customer.getId(), Integer.parseInt(item3.getItemId()), 1));

        cart.checkout();

        // This test is not done but work on the controller/service needs to be done for this to work properly

    }
}