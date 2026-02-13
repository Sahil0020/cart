package com.sprk.cart.service.impl;

import com.sprk.cart.model.Cart;
import com.sprk.cart.repository.OrderRepository;
import com.sprk.cart.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CardService {
    @Autowired
    private OrderRepository repository;
    @Override
    public List<Cart> getorder() {
        List<Cart> cart=repository.findAll();
        return cart;
    }
}
