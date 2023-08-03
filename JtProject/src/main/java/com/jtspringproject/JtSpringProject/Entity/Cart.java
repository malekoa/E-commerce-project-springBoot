package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue
    private Integer cartId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> containedItems = new ArrayList<>();
    public Cart() {
        super();
    }

    public Cart(Integer cartId, List<Item> containedItems) {
        super();
        this.cartId = cartId;
        this.containedItems = containedItems;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public List<Item> getContainedItems() {
        return containedItems;
    }

    public void setContainedItems(List<Item> containedItems) {
        this.containedItems = containedItems;
    }

    public void addItem(Item item) {
        containedItems.add(item);
        System.out.println("Add Item: " + item.getItemId());
    }

    public void removeItem(Item item) {
        containedItems.remove(item);
        System.out.println("Remove Item: " + item.getItemId());
    }

    public float getTotalPrice() {

        float total = 0;
        for (Item item : containedItems) {
            total += item.getProduct().getpPrice();
        }
        System.out.println("Total Price: " + total);
        return total;
    }

    public void clearCart(){
        containedItems.clear();
        System.out.println("Clear Cart");
    }

    public void checkout() {
        getTotalPrice();
        System.out.println("Checkout");
    }
}
