package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Item")
public class Item {

    @Id
    @GeneratedValue
    private Integer itemId;
    private String name;
    private float price;
    private String provider;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Item> recommendedItems = new ArrayList<Item>();

    private int quantity;

    public Item() {
        super();
    }

    public Item(Integer itemId, String name, int price, String provider, List<Item> recommendedItems, int quantity) {
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

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
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
        return "Item{" +
                "name='" + name + '\'' +
                ", itemId='" + itemId + '\'' +
                ", price=" + price +
                ", provider='" + provider + '\'' +
                ", recommendedItems=" + recommendedItems +
                ", quantity=" + quantity +
                '}';
    }

}
