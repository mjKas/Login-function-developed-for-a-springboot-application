package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.Product;
import com.manuja.shoppingapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public void Save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void Update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void Delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public Product FindById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
