package com.jtspringproject.JtSpringProject.Entity;
import javax.persistence.*;
/**
 * The Guest class represents a guest entity with its properties like ID, type, and cart.
 * This class is annotated as an entity for JPA (Java Persistence API) to enable ORM (Object-Relational Mapping).
 */
@Entity
@Table(name = "Guest")
public class Guest {

    /**
     * The primary key of the Guest entity.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * The type of the guest.
     */
    private String type;

    /**
     * The cart associated with the guest.
     */
    private Cart cart;

    /**
     * Default constructor for the Guest class.
     * Initializes the type to "Guest" and creates a new Cart for the guest.
     */
    public Guest() {
        this.type = "Guest";
        cart = new Cart();
    }

    /**
     * Get the guest ID.
     *
     * @return The guest ID.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the guest ID.
     *
     * @param id The guest ID to set.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the type of the guest.
     *
     * @return The type of the guest.
     */
    public String getType() {
        return type;
    }

    /**
     * Set the type of the guest.
     *
     * @param type The type of the guest to set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the cart associated with the guest.
     *
     * @return The cart associated with the guest.
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * Set the cart associated with the guest.
     *
     * @param cart The cart to set for the guest.
     */
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
