package com.jtspringproject.JtSpringProject.Service;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Customer;
import com.jtspringproject.JtSpringProject.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer createCustomer(Customer customer){
        return repository.save(customer);
    }

    public Customer findByEmail(String email){
        return repository.findByEmail(email);
    }

    public Cart getCartById(Integer id){
        return repository.getCartById(id);
    }

    public String addToCart(int customerID, int itemID, int quantity) {
        return "/cart";
    }

    public String applyCoupon(int customerID, int cartId) {
        return "/cart";
    }

    public String removeCoupon(int customerID, int cartId) {
        return "/cart";
    }

    public String checkout(int customerID, int cartId) {
        return "/cart";
    }

    public String confirmOrder(int customerID, int cartId) {
        return "/cart";
    }
//
//    public String addToCart(int customerID, int itemID, int quantity) {
//        return repository.addToCart(customerID, itemID, quantity);
//    }
}
