package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.CategoryType;
import com.manuja.shoppingapp.repository.CategoryTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryTypeServiceImpl implements CategoryTypeService {

    @Autowired
    private CategoryTypeRepository categoryTypeRepository;

    @Override
    public void save(CategoryType categoryType) {

        categoryTypeRepository.save(categoryType);
        //extends mehods in JPARepository
    }

    @Override
    public void update(CategoryType categoryType) {

        categoryTypeRepository.save(categoryType);
        //both save and update are done by save

    }

    @Override
    public void delete(CategoryType categoryType) {

        categoryTypeRepository.delete(categoryType);
    }

    @Override
    public List<CategoryType> findAll() {
        return categoryTypeRepository.findAll();
    }

    @Override
    public CategoryType findById(Integer id) {
        return categoryTypeRepository.findById(id).get();
    }
}
