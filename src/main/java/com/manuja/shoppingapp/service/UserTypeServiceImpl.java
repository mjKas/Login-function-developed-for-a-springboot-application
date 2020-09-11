package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.UserType;
import com.manuja.shoppingapp.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserTypeServiceImpl implements UserTypeService{
    @Autowired
    private UserTypeRepository userTypeRepository;
    @Override
    public void Save(UserType userType) {
        userTypeRepository.save(userType);
    }

    @Override
    public void Update(UserType userType) {
        userTypeRepository.save(userType);
    }

    @Override
    public void Delete(UserType userType) {
        userTypeRepository.delete(userType);
    }

    @Override
    public List<UserType> findAll() {
        return userTypeRepository.findAll();
    }

    @Override
    public UserType findById(Integer id) {
       return userTypeRepository.findById(id).get();
    }
}
