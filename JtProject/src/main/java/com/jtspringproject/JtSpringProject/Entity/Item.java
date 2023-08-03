package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Item")
public class Item {

    @Id
    @GeneratedValue
    private Integer itemId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pId")
    private Product product;

    public Item() {
        super();
    }

    public Item(Integer itemId, Product product) {
        super();
        this.itemId = itemId;
        this.product = product;
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

    @Override
    public String toString() {
        return "Item{" +
                ", itemId='" + itemId + '\'' +
                '}';
    }

}
