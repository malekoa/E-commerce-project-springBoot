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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pId")
    private Product product;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Item> recommendedItems = new ArrayList<>();
    public Item() {
        super();
    }

    public Item(Integer itemId, Product product, List<Item> recommendedItems) {
        super();
        this.itemId = itemId;
        this.product = product;
        this.recommendedItems = recommendedItems;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Item> getRecommendedItems() {
        return recommendedItems;
    }

    public void setRecommendedItems(List<Item> recommendedItems) {
        this.recommendedItems = recommendedItems;
    }

    @Override
    public String toString() {
        return "Item{" +
                ", itemId='" + itemId + '\'' +
                '}';
    }

}
