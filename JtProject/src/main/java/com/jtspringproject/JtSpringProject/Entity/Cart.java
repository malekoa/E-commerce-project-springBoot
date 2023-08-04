package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;
/**
 * The Cart class represents a cart entity with its properties like cart ID and a list of contained items.
 * This class is annotated as an entity for JPA (Java Persistence API) to enable ORM (Object-Relational Mapping).
 */
@Entity
@Table(name = "Cart")
public class Cart {

    /**
     * The primary key of the Cart entity.
     */
    @Id
    @GeneratedValue
    private Integer cartId;

    /**
     * The list of items contained in the cart.
     * This is a One-to-Many relationship with the Item entity, with CascadeType.ALL for cascading operations.
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> containedItems = new ArrayList<>();

    /**
     * Default constructor for the Cart class.
     */
    public Cart() {
        super();
    }

    /**
     * Parameterized constructor for the Cart class.
     *
     * @param cartId        The cart ID.
     * @param containedItems The list of items contained in the cart.
     */
    public Cart(Integer cartId, List<Item> containedItems) {
        super();
        this.cartId = cartId;
        this.containedItems = containedItems;
    }

    /**
     * Get the cart ID.
     *
     * @return The cart ID.
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * Set the cart ID.
     *
     * @param cartId The cart ID to set.
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**
     * Get the list of items contained in the cart.
     *
     * @return The list of items contained in the cart.
     */
    public List<Item> getContainedItems() {
        return containedItems;
    }

    /**
     * Set the list of items contained in the cart.
     *
     * @param containedItems The list of items to set in the cart.
     */
    public void setContainedItems(List<Item> containedItems) {
        this.containedItems = containedItems;
    }

    /**
     * Add an item to the cart.
     *
     * @param item The item to add to the cart.
     */
    public void addItem(Item item) {
        containedItems.add(item);
        System.out.println("Add Item: " + item.getItemId());
    }

    /**
     * Remove an item from the cart.
     *
     * @param item The item to remove from the cart.
     */
    public void removeItem(Item item) {
        containedItems.remove(item);
        System.out.println("Remove Item: " + item.getItemId());
    }

    /**
     * Calculate and return the total price of all items in the cart.
     *
     * @return The total price of all items in the cart.
     */
    public float getTotalPrice() {
        float total = 0;
        for (Item item : containedItems) {
            total += item.getProduct().getpPrice();
        }
        System.out.println("Total Price: " + total);
        return total;
    }

    /**
     * Clear the cart by removing all items from it.
     */
    public void clearCart() {
        containedItems.clear();
        System.out.println("Clear Cart");
    }

    /**
     * Perform the checkout process by calculating the total price and printing a message indicating checkout.
     */
    public void checkout() {
        getTotalPrice();
        System.out.println("Checkout");
    }
}
