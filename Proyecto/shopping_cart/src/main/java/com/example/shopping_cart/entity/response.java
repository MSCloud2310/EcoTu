package com.example.shopping_cart.entity;


import java.util.List;

public class response {

    shoppingCart shoppingCart;
    List<shopxservice> services;

    public response() {
    }

    public com.example.shopping_cart.entity.shoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(com.example.shopping_cart.entity.shoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<shopxservice> getServices() {
        return services;
    }

    public void setServices(List<shopxservice> services) {
        this.services = services;
    }
}
