package com.jtspringproject.JtSpringProject;

public class Item {

    private String itemId;
    private String name;
    private int price;
    private String provider;
    private String[] recommendedItems;

    public Item() {
        super();
    }

    public Item(String itemId, String name, int price, String provider, String[] recommendedItems) {
        super();
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.provider = provider;
        this.recommendedItems = recommendedItems;
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

    public int getPrice() {
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

    public String[] getRecommendedItems() {
        return recommendedItems;
    }

    public void setRecommendedItems(String[] recommendedItems) {
        this.recommendedItems=recommendedItems;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + ", provider=" + provider + ", recommendedItems=" + recommendedItems + "]";
    }


}
