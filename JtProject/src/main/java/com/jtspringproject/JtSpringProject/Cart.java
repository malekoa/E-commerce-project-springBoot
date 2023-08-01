package com.jtspringproject.JtSpringProject;

public class Cart {

    private String cartId;

    private Item[] containedItems;
    public Cart() {
        super();
    }

    public Cart(String cartId, Item[] containedItems) {
        super();
        this.cartId = cartId;
        this.containedItems = containedItems;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Item[] getContainedItems() {
        return containedItems;
    }

    public void setContainedItems(Item[] containedItems) {
        this.containedItems = containedItems;
    }

    public void addItem(Item item) {
        System.out.println("Add Item");
    }

    public void removeItem(Item item) {
        System.out.println("Remove Item");
    }

    public void getTotalPrice() {
        System.out.println("Get Total Price");

    }

    public void checkout() {
        System.out.println("Checkout");
    }
}
