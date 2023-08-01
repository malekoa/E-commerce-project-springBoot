package com.jtspringproject.JtSpringProject;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String itemId;
    private String name;
    private float price;
    private String provider;
    private List<Item> recommendedItems = new ArrayList<>();

    public Item() {
        super();
    }

    public Item(String itemId, String name, int price, String provider, List<Item> recommendedItems) {
        super();
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.provider = provider;
        this.recommendedItems = recommendedItems;
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

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + ", provider=" + provider + ", recommendedItems=" + recommendedItems + "]";
    }


}
