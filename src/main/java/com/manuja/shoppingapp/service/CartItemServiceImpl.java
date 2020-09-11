package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.CartItem;
import com.manuja.shoppingapp.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartItemServiceImpl implements CartItemService{
    @Autowired
    CartItemRepository cartItemRepository;
    @Override
    public void Save(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    @Override
    public void Update(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    @Override
    public void Delete(CartItem cartItem) {
        cartItemRepository.delete(cartItem);
    }

    @Override
    public CartItem findbyID(Integer id) {
        return cartItemRepository.findById(id).get();
    }

    @Override
    public List<CartItem> findAll() {
        return cartItemRepository.findAll();
    }
}
