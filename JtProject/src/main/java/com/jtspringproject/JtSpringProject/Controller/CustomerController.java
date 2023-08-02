package com.jtspringproject.JtSpringProject.Controller;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Customer;
import com.jtspringproject.JtSpringProject.Entity.User;
import com.jtspringproject.JtSpringProject.Service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController{
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

//    @PostMapping("/addToCart")
//    public String addToCart(@RequestParam("customerId") int customerID,
//                            @RequestParam("ItemID") int itemID,
//                            @RequestParam("quantity") int quantity){
//        return service.addToCart(customerID, itemID, quantity);
//    }

    @PostMapping("/register/customer")
    public String newCustomerRegister(@RequestParam("username") String username,@RequestParam("password") String password)
    {// TODO - hash password before saving
        try
        {
            Customer customer = new Customer();
            customer.setUsername(username);
            customer.setPassword(password);
            service.createCustomer(customer);
            return "redirect:/home";
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
            return "redirect:/error";
        }
    }
}
