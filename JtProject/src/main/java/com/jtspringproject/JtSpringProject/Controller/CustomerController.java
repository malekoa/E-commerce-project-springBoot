package com.jtspringproject.JtSpringProject.Controller;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController extends UserController{
    private CustomerService service;
    // Use cases:
    // Add to cart
    // View Cart - Done
    // Checkout
    // Delete Account

    //
    @GetMapping("/cart")
    public Cart viewCart(@RequestParam("customerId") int customerID)
    {
        return service.getCartById(customerID);
    }

    @PostMapping("/addToCart")
    public String addToCart(@RequestParam("customerId") int customerID,
                            @RequestParam("ItemID") int itemID,
                            @RequestParam("quantity") int quantity){
        return service.addToCart(customerID, itemID, quantity);
    }
/* 
    @PostMapping("/applyCoupon")
    public String applyCoupon(@RequestParam("customerId") int customerID,
                            @RequestParam("cartId") int cartId){
        return service.applyCoupon(customerID, cartId);
    }

    @PostMapping("/removeCoupon")
    public String removeCoupon(@RequestParam("customerId") int customerID,
                            @RequestParam("cartId") int cartId){
        return service.removeCoupon(customerID, cartId);
    }

    @PostMapping("/checkout")
    public String checkout(@RequestParam("customerId") int customerID,
                            @RequestParam("cartId") int cartId){
        return service.checkout(customerID, cartId);
    }

    @PostMapping("/confirmOrder")
    public String confirmOrder(@RequestParam("customerId") int customerID,
                            @RequestParam("cartId") int cartId){
        return service.confirmOrder(customerID, cartId);
    }
*/
}
