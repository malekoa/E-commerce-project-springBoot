package com.jtspringproject.JtSpringProject.Repository;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    /**
     * Finds a customer by their email address.
     *
     * @param email The email address of the customer to find.
     * @return The Customer entity matching the provided email, or null if not found.
     */
    @Query(value = "SELECT * FROM Customer WHERE email=?1", nativeQuery = true)
    Customer findByEmail(String email);

    /**
     * Gets the cart of a customer by their ID.
     *
     * @param id The ID of the customer.
     * @return The Cart entity associated with the provided customer ID, or null if not found.
     */
    @Query(value = "SELECT Cart.CartID, Cart.ContainedItems FROM Customer JOIN Cart ON Customer.cartID=Cart.cartID WHERE CustomerID=?1", nativeQuery = true)
    Cart getCartById(int id);



    //    TODO - This needs a way to integrate quantity
    // @Query(value = "INSERT INTO Cart VALUES (customerID.cartID, itemID)")
    String addToCart(int customerID, int itemID, int quantity);

    //@Query(value = "INSERT INTO ", nativeQuery = true)
    //String addToCart(int customerID, int itemID, int quantity);

}
