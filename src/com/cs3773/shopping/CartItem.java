package com.cs3773.shopping;

public class CartItem {
    private String name;
    private Double price;
    private Integer quantity;
    private final int itemID;

    public CartItem(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.itemID = name.hashCode();
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getID() {
        return itemID;
    }
}
