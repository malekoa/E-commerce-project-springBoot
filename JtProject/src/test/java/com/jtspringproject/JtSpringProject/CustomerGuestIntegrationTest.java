package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.Guest;
import com.jtspringproject.JtSpringProject.Entity.Item;
import com.jtspringproject.JtSpringProject.Entity.Customer;
import com.jtspringproject.JtSpringProject.Entity.User;
import com.jtspringproject.JtSpringProject.Controller.UserController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerGuestIntegrationTest {
    private Customer customer;
    private Guest guest;
    private UserController userController;

    @BeforeEach
    public void setup() {
        // Initialize your objects
        userController = new UserController();
        guest = new Guest();
        customer = new Customer();

        // Assume that a guest has some items in the cart
        Item item1 = new Item();
        Item item2 = new Item();
        guest.getCart().getContainedItems().add(item1);
        guest.getCart().getContainedItems().add(item2);
    }

    @Test
    public void testGuestToCustomerTransition() {
        // Call the method that transitions a guest to a registered customer
        Customer transitionedCustomer = userController.transitionGuestToCustomer(guest, "John Doe", "johndoe@example.com", "password", "123 Main St");

        // Assert that the transitioned customer is not null
        assertNotNull(transitionedCustomer);

        // Assert that the cart of the transitioned customer has the same items as the guest
        // query for cart based on cart id

        assertEquals(guest.getCart().getContainedItems(), transitionedCustomer.getCart().getContainedItems());
    }
}
