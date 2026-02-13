package com.sprk.cart.controller;

import com.sprk.cart.model.Cart;
import com.sprk.cart.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CardService service;
    @GetMapping ("/order")
    public List<Cart> order(){
        List<Cart> cart=service.getorder();
        return cart;
    }
}
