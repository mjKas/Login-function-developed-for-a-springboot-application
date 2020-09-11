package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.Cart;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CartService {
    public void Save(Cart cart);
    public void Update(Cart cart);
    public void Delete(Cart cart);
    public Cart findbyID(Integer id);
    public List<Cart> findAll();
}
