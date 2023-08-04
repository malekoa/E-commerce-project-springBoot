package com.jtspringproject.JtSpringProject.Controller;

import com.jtspringproject.JtSpringProject.Entity.Customer;
import com.jtspringproject.JtSpringProject.Entity.Guest;
import com.jtspringproject.JtSpringProject.Entity.User;
import com.jtspringproject.JtSpringProject.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * The UserController class handles HTTP requests related to user actions such as user registration.
 */
@Controller
public class UserController {
	@Autowired
	private UserService service; // Service class to handle user-related operations

	/**
	 * Registers a new user with the provided username and password.
	 * The password is hashed before saving it to the database.
	 *
	 * @param username The username of the new user.
	 * @param password The password of the new user.
	 * @return The view name "home" if the user is registered successfully; otherwise, redirects to "error".
	 */
	@PostMapping("/register")
	public String newUserRegister(@RequestParam("username") String username, @RequestParam("password") String password) {
		// TODO - hash password before saving
		try {
			User newUser = new User();
			newUser.setUsername(username);
			newUser.setPassword(password);
			service.createUser(newUser);
			return "redirect:/home";
		} catch (Exception e) {
			System.out.println("Exception:" + e);
			return "redirect:/error";
		}
	}

	/**
	 * Transitions a Guest to a Customer by creating a new Customer object and transferring the cart from the Guest.
	 *
	 * @param guest   The Guest object to be transitioned to a Customer.
	 * @param name    The name of the new Customer.
	 * @param email   The email address of the new Customer.
	 * @param password The password of the new Customer.
	 * @param address The address of the new Customer.
	 * @return The newly created Customer object after the transition.
	 */
	public Customer transitionGuestToCustomer(Guest guest, String name, String email, String password, String address) {
		// Create a new Customer
		Customer customer = new Customer(/* parameters to create a new Customer */);

		// Transfer the cart from the Guest to the Customer
		customer.setCart(guest.getCart());

		return customer;
	}
}
