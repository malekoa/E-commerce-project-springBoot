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
    private Integer pId;
    private int quantity;

    public Item() {
        super();
    }

    public Item(Integer itemId, int quantity) {
        super();
        this.itemId = itemId;
        this.quantity = quantity;
    }


    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId){
        this.pId =  pId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                ", itemId='" + itemId + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
