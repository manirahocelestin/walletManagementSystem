package com.example.walletmanagement.controller;

import com.example.walletmanagement.model.ShoppingCart;
import com.example.walletmanagement.repository.ShoppingCartRepo;
import com.example.walletmanagement.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartControllerAPI {
    @Autowired
    private ShoppingCartService service;
    @PostMapping("/saveCart")
    public ResponseEntity<ShoppingCart> createShoppingCart(@RequestBody ShoppingCart shoppingCart){
        return new ResponseEntity<>(service.createShoppingCart(shoppingCart), HttpStatus.OK);

    }
    @GetMapping("/AllCart")
    public ResponseEntity<List<ShoppingCart>> getAllShoppingCart(){
        return new ResponseEntity<>(service.findAllShopping(),HttpStatus.OK);
    }
//    @GetMapping("/searchByName/{name}")
//    public ResponseEntity<List<ShoppingCart>> findByName(@PathVariable String name){
//        return new ResponseEntity<>(service.findShoppingCartByName(name),HttpStatus.OK);
//
//    }
    
    @GetMapping("/deleteCart/{id}")
    public ResponseEntity<?> removeShoppingCart(@PathVariable String id){
        service.deleteShoppingCart(id);
        return ResponseEntity.noContent().build();

    }
    @PutMapping("/updateCart/{id}")
    public ResponseEntity<ShoppingCart> updateShoppingCart(@PathVariable String id, @RequestBody ShoppingCart shoppingCart){
        ShoppingCart cartUpdate = service.updateShopping(id,shoppingCart);
        return ResponseEntity.ok(cartUpdate);

    }
}
