package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer pId;
    public String pName;
    public int pPrice;
    public int pQuantity;
    public Product() {
        super();
    }

    public Product(Integer pId, String pName, int pPrice, int pQuantity) {
        super();
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pQuantity = pQuantity;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpPrice() {
        int price = pPrice * pQuantity;
        return price;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice * pQuantity;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

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
