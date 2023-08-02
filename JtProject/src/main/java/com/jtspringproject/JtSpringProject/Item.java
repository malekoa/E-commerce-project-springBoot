package com.jtspringproject.JtSpringProject;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String itemId;
    private String name;
    private float price;
    private String provider;
    private List<Item> recommendedItems = new ArrayList<>();

    private int quantity;

    public Item() {
        super();
    }

    public Item(String itemId, String name, int price, String provider, List<Item> recommendedItems, int quantity) {
        super();
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.provider = provider;
        this.recommendedItems = recommendedItems;
        this.quantity = quantity;
    }

    public Item(int price){
        super();
        this.price=price;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price=price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider=provider;
    }

    public List<Item> getRecommendedItems() {
        return recommendedItems;
    }

    public void setRecommendedItems(List<Item> recommendedItems) {
        this.recommendedItems=recommendedItems;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }

    public float getTotalPrice() {
        return price * quantity;
    }

    public void addRecommendedItem(Item item) {
        recommendedItems.add(item);
    }

    public void removeRecommendedItem(Item item) {
        recommendedItems.remove(item);
    }


    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", name=" + name + ", price per item=" + price + ", provider=" + provider + ", recommendedItems=" + recommendedItems + ", quantity=" + quantity + ", total price=" + getTotalPrice() + "]";
    }


}
