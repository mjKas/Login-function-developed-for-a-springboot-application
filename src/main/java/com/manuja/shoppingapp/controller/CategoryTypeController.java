package com.manuja.shoppingapp.controller;

import com.manuja.shoppingapp.entity.CategoryType;
import com.manuja.shoppingapp.service.CategoryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CategoryTypeController {

    @Autowired
    private CategoryTypeService categoryTypeService;

    @RequestMapping( value="/categorytype" , method = RequestMethod.GET)
    public String loadCategoryTypeForm(ModelMap model){

        CategoryType catType = new CategoryType();
        //setting Model
        model.addAttribute("categoryTypeObj",catType);


        List<CategoryType> catTypeList = categoryTypeService.findAll();

        model.addAttribute("catTypeList",catTypeList);

        model.addAttribute("saveFlag",true);
        //System.out.println("Load category type form function");
        return "CategoryType";
    }

    @RequestMapping( value="/categorytype" , method = RequestMethod.POST)
    public String saveCategoryType(CategoryType categoryTypeObj , ModelMap model){

        categoryTypeService.save(categoryTypeObj);

        CategoryType catType = new CategoryType();
        //setting Model
        model.addAttribute("categoryTypeObj",catType);
        List<CategoryType> catTypeList = categoryTypeService.findAll();

        model.addAttribute("catTypeList",catTypeList);
        model.addAttribute("saveFlag",true);

        return "CategoryType";
        //returning
    }

    @RequestMapping(value = "/edit-categorytype-{id}" , method = RequestMethod.GET)
    public String editCategoryType(@PathVariable String id, ModelMap model){

        Integer intId = Integer.parseInt(id);
        CategoryType catType = categoryTypeService.findById(intId);
        model.addAttribute("categoryTypeObj",catType);

        List<CategoryType> catTypeList = categoryTypeService.findAll();

        model.addAttribute("catTypeList",catTypeList);
        model.addAttribute("saveFlag",false);

        return "CategoryType";
    }

    @RequestMapping(value = "/edit-categorytype-{id}" , method = RequestMethod.POST)
    public String updateCategoryType(CategoryType categoryTypeObj,@PathVariable String id, ModelMap model){

        categoryTypeService.update(categoryTypeObj);

        CategoryType catType = new CategoryType();
        //setting Model
        model.addAttribute("categoryTypeObj",catType);
        List<CategoryType> catTypeList = categoryTypeService.findAll();

        model.addAttribute("catTypeList",catTypeList);
        model.addAttribute("saveFlag",true);

        return "CategoryType";
    }

    @RequestMapping(value = "/delete-categorytype-{id}" , method = RequestMethod.GET)
    public String deleteCategoryType(@PathVariable String id, ModelMap model){

        Integer intId = Integer.parseInt(id);
        CategoryType catType = categoryTypeService.findById(intId);
        categoryTypeService.delete(catType);

        CategoryType newCatType = new CategoryType();
        model.addAttribute("categoryTypeObj",newCatType);

        List<CategoryType> catTypeList = categoryTypeService.findAll();

        model.addAttribute("catTypeList",catTypeList);
        model.addAttribute("saveFlag",true);

        return "CategoryType";
    }
}
