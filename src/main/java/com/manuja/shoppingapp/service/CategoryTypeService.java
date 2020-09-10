package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.CategoryType;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryTypeService {

    public void save(CategoryType categoryType);
    public void update(CategoryType categoryType);
    public void delete(CategoryType categoryType);
    public List<CategoryType> findAll();
    public CategoryType findById(Integer id);
}
