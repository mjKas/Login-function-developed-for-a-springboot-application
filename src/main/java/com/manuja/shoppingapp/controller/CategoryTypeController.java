package com.manuja.shoppingapp.controller;

import com.manuja.shoppingapp.entity.CategoryType;
import com.manuja.shoppingapp.service.CategoryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryTypeController {

    @Autowired
    private CategoryTypeService categoryTypeService;

    @RequestMapping( value="/categorytype" , method = RequestMethod.GET)
    public String loadCategoryTypeForm(ModelMap model){

        CategoryType catType = new CategoryType();
        //setting Model
        model.addAttribute("categoryTypeObj",catType);

        //System.out.println("Load category type form function");
        return "CategoryType";
    }

    @RequestMapping( value="/categorytype" , method = RequestMethod.POST)
    public String saveCategoryType(CategoryType catType , ModelMap model){

        categoryTypeService.save(catType);

        return "CategoryType";
    }
}
