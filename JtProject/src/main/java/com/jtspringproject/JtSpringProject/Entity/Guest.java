package com.jtspringproject.JtSpringProject.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Guest")
public class Guest{
    // Guest attributes
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String type;
    private Cart cart;

    // Constructor
    public Guest(){
        this.type = "Guest";
        cart = new Cart();
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", type=" + type +
                '}';
    }
}