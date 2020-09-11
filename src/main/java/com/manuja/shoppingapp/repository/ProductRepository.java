package com.manuja.shoppingapp.repository;

import com.manuja.shoppingapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
