package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.Product;

import java.util.List;

public interface ProductService {
    public void Save(Product product);
    public void Update(Product product);
    public void Delete(Product product);
    public  Product FindById(Integer id);
    public List<Product>findAll();
}
