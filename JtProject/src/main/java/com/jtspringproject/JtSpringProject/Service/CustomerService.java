package com.jtspringproject.JtSpringProject.Service;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Customer;
import com.jtspringproject.JtSpringProject.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for managing Customer entities.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    /**
     * Creates a new customer.
     *
     * @param customer The Customer entity to create.
     * @return The created Customer entity.
     */
    public Customer createCustomer(Customer customer){
        return repository.save(customer);
    }

    /**
     * Retrieves a customer by their email.
     *
     * @param email The email of the customer to retrieve.
     * @return The Customer entity with the provided email, or null if not found.
     */
    public Customer findByEmail(String email){
        return repository.findByEmail(email);
    }

    /**
     * Retrieves the cart of a customer by their ID.
     *
     * @param id The ID of the customer whose cart to retrieve.
     * @return The Cart entity associated with the provided customer ID.
     */
    public Cart getCartById(Integer id){
        return repository.getCartById(id);
    }

    /**
     * Adds an item to the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param itemID The ID of the item to add.
     * @param quantity The quantity of the item to add.
     * @return The URL to redirect after adding the item to the cart.
     */
    public String addToCart(int customerID, int itemID, int quantity) {
        return "/cart";
    }

    /**
     * Applies a coupon to the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param cartId The ID of the cart.
     * @return The URL to redirect after applying the coupon.
     */
    public String applyCoupon(int customerID, int cartId) {
        return "/cart";
    }

    /**
     * Removes a coupon from the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param cartId The ID of the cart.
     * @return The URL to redirect after removing the coupon.
     */
    public String removeCoupon(int customerID, int cartId) {
        return "/cart";
    }

    /**
     * Processes the checkout for the customer's cart.
     *
     * @param customerID The ID of the customer.
     * @param cartId The ID of the cart.
     * @return The URL to redirect after the checkout process.
     */
    public String checkout(int customerID, int cartId) {
        return "/cart";
    }

    /**
     * Confirms the customer's order.
     *
     * @param customerID The ID of the customer.
     * @param cartId The ID of the cart.
     * @return The URL to redirect after confirming the order.
     */
    public String confirmOrder(int customerID, int cartId) {
        return "/cart";
    }

    //
//    public String addToCart(int customerID, int itemID, int quantity) {
//        return repository.addToCart(customerID, itemID, quantity);
//    }
}
