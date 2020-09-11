package com.manuja.shoppingapp.repository;

import com.manuja.shoppingapp.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Integer> {
}
