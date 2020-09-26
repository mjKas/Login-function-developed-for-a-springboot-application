package com.manuja.shoppingapp.controller;

import com.manuja.shoppingapp.service.HomeService;
import com.manuja.shoppingapp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;
    @Autowired
    HomeService homeService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loadHome(){
        return "Login";
    }

    @RequestMapping(name = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String letLogin(@RequestParam String username, @RequestParam String Password, ModelMap modelMap){

        if(homeService.isUserExist(username,Password)==true){
            logger.info("signin");
            return "ProductDisplay";
        }
        else {
            modelMap.addAttribute("ErrorMessage","Username or Password incorrect");
            logger.info("username and password incorect: signin");
            return "Login";

        }

    }
}
