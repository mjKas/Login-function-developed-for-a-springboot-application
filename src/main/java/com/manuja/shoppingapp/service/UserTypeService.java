package com.manuja.shoppingapp.service;

import com.manuja.shoppingapp.entity.UserType;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserTypeService {
    public void Save(UserType userType);
    public void Update(UserType userType);
    public void Delete(UserType userType);
    public List<UserType>findAll();
    public  UserType findById(Integer id);

}
