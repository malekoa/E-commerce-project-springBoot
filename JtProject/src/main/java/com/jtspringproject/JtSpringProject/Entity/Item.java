package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 * The Item class represents an item entity with its properties like item ID, associated product, and recommended items.
 * This class is annotated as an entity for JPA (Java Persistence API) to enable ORM (Object-Relational Mapping).
 */
@Entity
@Table(name = "Item")
public class Item {

    /**
     * The primary key of the Item entity.
     */
    @Id
    @GeneratedValue
    private Integer itemId;

    /**
     * The associated product for the item.
     * This is a Many-to-One relationship with the Product entity.
     * Lazy fetching is used, so the associated Product will be loaded when accessed.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pId")
    private Product product;

    /**
     * The list of recommended items associated with this item.
     * This is a Many-to-Many relationship with the Item entity, with CascadeType.ALL for cascading operations.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    List<Item> recommendedItems = new ArrayList<>();

    /**
     * Default constructor for the Item class.
     */
    public Item() {
        super();
    }

    /**
     * Parameterized constructor for the Item class.
     *
     * @param itemId           The item ID.
     * @param product          The associated product for the item.
     * @param recommendedItems The list of recommended items associated with this item.
     */
    public Item(Integer itemId, Product product, List<Item> recommendedItems) {
        super();
        this.itemId = itemId;
        this.product = product;
        this.recommendedItems = recommendedItems;
    }

    /**
     * Get the item ID.
     *
     * @return The item ID.
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Set the item ID.
     *
     * @param itemId The item ID to set.
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * Get the associated product for the item.
     *
     * @return The associated product.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Set the associated product for the item.
     *
     * @param product The associated product to set.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Get the list of recommended items associated with this item.
     *
     * @return The list of recommended items.
     */
    public List<Item> getRecommendedItems() {
        return recommendedItems;
    }

    /**
     * Set the list of recommended items associated with this item.
     *
     * @param recommendedItems The list of recommended items to set.
     */
    public void setRecommendedItems(List<Item> recommendedItems) {
        this.recommendedItems = recommendedItems;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                '}';
    }
}
