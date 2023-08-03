package com.jtspringproject.JtSpringProject.Repository;

import com.jtspringproject.JtSpringProject.Entity.Cart;
import com.jtspringproject.JtSpringProject.Entity.Customer;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends UserRepository{
    @Query(value = "SELECT * FROM Customer WHERE email=?1", nativeQuery = true)
    Customer findByEmail(String email);


    @Query(value = "SELECT Cart.CartID, Cart.ContainedItems FROM Customer JOIN Cart ON Customer.cartID=Cart.cartID WHERE CustomerID=?1", nativeQuery = true)
    Cart getCartById(int id);

    //    TODO - This needs a way to integrate quantity
    // @Query(value = "INSERT INTO Cart VALUES (customerID.cartID, itemID)")
    String addToCart(int customerID, int itemID, int quantity);
}
