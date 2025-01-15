package com.cs3773.shopping;

import java.util.HashMap;
import java.util.Map;
public class ShoppingCart {
    HashMap<Integer, CartItem> shoppingCart;

    public ShoppingCart() {
        shoppingCart = new HashMap<>();
    }

    public void addItem(CartItem item) {
        shoppingCart.put(item.getID(), item);
    }

    public void removeItem(CartItem item) {
        shoppingCart.remove(item.getID());
    }

    public Map<Integer, CartItem> getCartItems() {
        return shoppingCart;
    }

    public Double getTotalPrice() {
        Double totalPrice=0.0;
        Map<Integer,CartItem> map = this.getCartItems();

        for (Map.Entry<Integer, CartItem> items : map.entrySet()) {
            totalPrice = totalPrice + items.getValue().getPrice();
        }
        return totalPrice;
    }

    public void addProduct(Product product, int quantity) {
       CartItem item = new CartItem(product.getName(), product.getPrice(), quantity);
       this.addItem(item);
    }
}
