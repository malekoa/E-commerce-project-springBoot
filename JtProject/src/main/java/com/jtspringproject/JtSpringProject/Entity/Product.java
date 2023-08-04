package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;
/**
 * The Product class represents a product entity with its properties like ID, name, price, and quantity.
 * This class is annotated as an entity for JPA (Java Persistence API) to enable ORM (Object-Relational Mapping).
 */
@Entity
@Table(name = "Product")
public class Product {

    /**
     * The primary key of the Product entity.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer pId;

    /**
     * The name of the product.
     */
    public String pName;

    /**
     * The price of the product per unit.
     */
    public int pPrice;

    /**
     * The quantity of the product available in stock.
     */
    public int pQuantity;

    /**
     * Default constructor for the Product class.
     */
    public Product() {
        super();
    }

    /**
     * Parameterized constructor for the Product class.
     *
     * @param pId      The product ID.
     * @param pName    The product name.
     * @param pPrice   The price of the product per unit.
     * @param pQuantity The quantity of the product available in stock.
     */
    public Product(Integer pId, String pName, int pPrice, int pQuantity) {
        super();
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pQuantity = pQuantity;
    }

    /**
     * Get the product ID.
     *
     * @return The product ID.
     */
    public int getpId() {
        return pId;
    }

    /**
     * Set the product ID.
     *
     * @param pId The product ID to set.
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * Get the product name.
     *
     * @return The product name.
     */
    public String getpName() {
        return pName;
    }

    /**
     * Set the product name.
     *
     * @param pName The product name to set.
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * Get the total price of the product (price * quantity).
     *
     * @return The total price of the product.
     */
    public int getpPrice() {
        int price = pPrice * pQuantity;
        return price;
    }

    /**
     * Set the product price (will be multiplied by the current quantity).
     *
     * @param pPrice The product price to set.
     */
    public void setpPrice(int pPrice) {
        this.pPrice = pPrice * pQuantity;
    }

    /**
     * Get the product quantity.
     *
     * @return The product quantity.
     */
    public int getpQuantity() {
        return pQuantity;
    }

    /**
     * Set the product quantity.
     *
     * @param pQuantity The product quantity to set.
     */
    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ", pQuantity=" + pQuantity +
                '}';
    }
}
