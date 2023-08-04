package com.jtspringproject.JtSpringProject.Controller;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Customer;
import com.jtspringproject.JtSpringProject.Entity.User;
import com.jtspringproject.JtSpringProject.Service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * The CustomerController class handles HTTP requests related to customer actions such as adding to cart,
 * viewing cart, applying and removing coupons, checkout, and customer registration.
 */
@Controller
public class CustomerController {
    private CustomerService service; // Service class to handle customer-related operations

    /**
     * Retrieves the cart details for the specified customer from the database.
     *
     * @param customerID The ID of the customer whose cart is to be retrieved.
     * @return The Cart object representing the customer's cart.
     */
    @GetMapping("/cart")
    public Cart viewCart(@RequestParam("customerId") int customerID) {
        return service.getCartById(customerID);
    }

    /**
     * Adds an item with the specified quantity to the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param itemID     The ID of the item to be added to the cart.
     * @param quantity   The quantity of the item to be added.
     * @return A string indicating the status of the operation (e.g., success or failure).
     */
    @PostMapping("/addToCart")
    public String addToCart(@RequestParam("customerId") int customerID,
                            @RequestParam("ItemID") int itemID,
                            @RequestParam("quantity") int quantity) {
        return service.addToCart(customerID, itemID, quantity);
    }

    /**
     * Applies a coupon to the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param cartId     The ID of the cart to which the coupon is to be applied.
     * @return A string indicating the status of the operation (e.g., success or failure).
     */
    @PostMapping("/applyCoupon")
    public String applyCoupon(@RequestParam("customerId") int customerID,
                              @RequestParam("cartId") int cartId) {
        return service.applyCoupon(customerID, cartId);
    }

    /**
     * Removes a coupon from the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param cartId     The ID of the cart from which the coupon is to be removed.
     * @return A string indicating the status of the operation (e.g., success or failure).
     */
    @PostMapping("/removeCoupon")
    public String removeCoupon(@RequestParam("customerId") int customerID,
                               @RequestParam("cartId") int cartId) {
        return service.removeCoupon(customerID, cartId);
    }

    /**
     * Initiates the checkout process for the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param cartId     The ID of the cart to be checked out.
     * @return A string indicating the status of the checkout process (e.g., success or failure).
     */
    @PostMapping("/checkout")
    public String checkout(@RequestParam("customerId") int customerID,
                           @RequestParam("cartId") int cartId) {
        return service.checkout(customerID, cartId);
    }

    /**
     * Confirms and places the order for the items in the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param cartId     The ID of the cart containing the items to be ordered.
     * @return A string indicating the status of the order confirmation (e.g., success or failure).
     */
    @PostMapping("/confirmOrder")
    public String confirmOrder(@RequestParam("customerId") int customerID,
                               @RequestParam("cartId") int cartId) {
        return service.confirmOrder(customerID, cartId);
    }

    /**
     * Registers a new customer with the provided username, password, email, and address.
     * The password is hashed before saving it to the database.
     *
     * @param username The username of the new customer.
     * @param password The password of the new customer.
     * @param email    The email address of the new customer.
     * @param address  The address of the new customer.
     * @return The view name "userlogin" if the customer is registered successfully; otherwise, redirects to "error".
     */
    @PostMapping("/register")
    public String newCustomerRegister(@RequestParam("username") String username,
                                      @RequestParam("password") String password,
                                      @RequestParam("email") String email,
                                      @RequestParam("address") String address) {
        // TODO - hash password before saving
        try {
            Customer customer = new Customer();
            customer.setUsername(username);
            customer.setPassword(password);
            customer.setAddress(address);
            customer.setEmail(email);
            service.createCustomer(customer);
            System.out.println("Created customer");
            return "userlogin";
        } catch (Exception e) {
            System.out.println("Exception:"+e);
            return "redirect:/error";
        }
    }
}
