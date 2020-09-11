package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.Cart;
import com.manuja.shoppingapp.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Override
    public void Save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void Update(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void Delete(Cart cart) {
        cartRepository.delete(cart);
    }

    @Override
    public Cart findbyID(Integer id) {
        return cartRepository.findById(id).get();
    }

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }
}
