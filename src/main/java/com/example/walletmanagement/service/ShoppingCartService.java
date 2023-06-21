package com.example.walletmanagement.service;

import com.example.walletmanagement.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    ShoppingCart createShoppingCart(ShoppingCart shoppingCart);
    List<ShoppingCart> findAllShopping();
    List<ShoppingCart> findShoppingCartById(String id);
    //List<ShoppingCart> findShoppingCartByName(String name);
    ShoppingCart updateShopping(String id, ShoppingCart cart);
    void deleteShoppingCart(String id);
}
