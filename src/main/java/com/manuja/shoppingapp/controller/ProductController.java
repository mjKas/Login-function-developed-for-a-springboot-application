package com.manuja.shoppingapp.controller;

import com.manuja.shoppingapp.entity.CategorySubType;
import com.manuja.shoppingapp.entity.Product;
import com.manuja.shoppingapp.service.CategorySubTypeService;
import com.manuja.shoppingapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategorySubTypeService categorySubTypeService;

    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public String loadProductForm(ModelMap modelMap){
        Product product = new Product();
        modelMap.addAttribute("productObj",product);

        List<Product>products = productService.findAll();
        modelMap.addAttribute("products",products);

        List<CategorySubType>categorySubTypeList = categorySubTypeService.findAll();
        modelMap.addAttribute("categorySubTypeList",categorySubTypeList);
        modelMap.addAttribute("saveFlag",true);
        return "Product";
    }
    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public String saveProduct(Product product, ModelMap modelMap){
        productService.Save(product);

        Product product1 = new Product();
        modelMap.addAttribute("productObj",product1);

        List<Product>products = productService.findAll();
        modelMap.addAttribute("products",products);

        List<CategorySubType>categorySubTypeList = categorySubTypeService.findAll();
        modelMap.addAttribute("categorySubTypeList",categorySubTypeList);
        modelMap.addAttribute("saveFlag",true);
        return "Product";
    }
    @RequestMapping(value = "/edit-Product-{id}",method = RequestMethod.GET)
    public  String editProduct(ModelMap modelMap, @PathVariable String id){
        Integer Id = Integer.parseInt(id);
        Product product = productService.FindById(Id);
        modelMap.addAttribute("productObj",product);

        List<Product>products = productService.findAll();
        modelMap.addAttribute("products",products);

        List<CategorySubType>categorySubTypeList = categorySubTypeService.findAll();
        modelMap.addAttribute("categorySubTypeList",categorySubTypeList);
        modelMap.addAttribute("saveFlag",false);
        return "Product";
    }
    @RequestMapping(value = "/edit-Product-{id}",method = RequestMethod.POST)
    public  String updateProduct(ModelMap modelMap, Product product){
        productService.Update(product);

        Product product1 = new Product();
        modelMap.addAttribute("productObj",product1);

        List<Product>products = productService.findAll();
        modelMap.addAttribute("products",products);

        List<CategorySubType>categorySubTypeList = categorySubTypeService.findAll();
        modelMap.addAttribute("categorySubTypeList",categorySubTypeList);
        modelMap.addAttribute("saveFlag",true);
        return "Product";
    }
    @RequestMapping(value = "/delete-Product-{id}",method = RequestMethod.GET)
    public  String deleteProduct(@PathVariable String id, ModelMap modelMap){
        Integer Id = Integer.parseInt(id);
        Product product = productService.FindById(Id);
        productService.Delete(product);

        Product product1 = new Product();
        modelMap.addAttribute("productObj",product1);

        List<Product>products = productService.findAll();
        modelMap.addAttribute("products",products);

        List<CategorySubType>categorySubTypeList = categorySubTypeService.findAll();
        modelMap.addAttribute("categorySubTypeList",categorySubTypeList);
        modelMap.addAttribute("saveFlag",true);
        return "Product";
    }
}
