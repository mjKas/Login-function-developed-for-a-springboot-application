package com.manuja.shoppingapp.controller;

import com.manuja.shoppingapp.service.HomeService;
import com.manuja.shoppingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    UserService userService;
    @Autowired
    HomeService homeService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loadHome(){
        return "Index";
    }
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public  String signUp(@RequestParam String name, @RequestParam  String password, @RequestParam String repassword, ModelMap modelMap){

        homeService.saveUser(name,password,repassword);
        return "Index";
    }

}
