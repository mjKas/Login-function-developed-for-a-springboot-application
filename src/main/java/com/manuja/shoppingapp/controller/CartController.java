package com.manuja.shoppingapp.controller;

import com.manuja.shoppingapp.entity.Cart;
import com.manuja.shoppingapp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping(value = "/header",method = RequestMethod.GET)
    public String loadHeader(ModelMap modelMap){

        return "Header";

    }

    @RequestMapping(value = "/cart",method = RequestMethod.GET)
    public String loadCart(ModelMap modelMap){
        Cart cart = new Cart();
        modelMap.addAttribute("cartObj",cart);

        List<Cart>cartList = cartService.findAll();
        modelMap.addAttribute("cartList",cartList);
        modelMap.addAttribute("saveFlag",true);

        return "Cart";

    }
    @RequestMapping(value = "/cart",method = RequestMethod.POST)
    public String saveCart(Cart cart, ModelMap modelMap){
        cartService.Save(cart);

        Cart cart1 = new Cart();
        modelMap.addAttribute("cartObj",cart1);

        List<Cart>cartList = cartService.findAll();
        modelMap.addAttribute("cartList",cartList);
        modelMap.addAttribute("saveFlag",true);

        return "Cart";
    }

    public String editCart(@PathVariable String id, ModelMap modelMap){
        Integer intId = Integer.parseInt(id);
        Cart cart = cartService.findbyID(intId);

        modelMap.addAttribute("cartObj",cart);

        List<Cart>cartList = cartService.findAll();
        modelMap.addAttribute("cartList",cartList);
        modelMap.addAttribute("saveFlag",false);

        return "Cart";

    }

    public String updateCart(Cart cart, ModelMap modelMap){
        cartService.Update(cart);

        Cart cart1 = new Cart();
        modelMap.addAttribute("cartObj",cart1);

        List<Cart>cartList = cartService.findAll();
        modelMap.addAttribute("cartList",cartList);
        modelMap.addAttribute("saveFlag",true);

        return "Cart";
    }

    public String deleteCart(@PathVariable String id, ModelMap modelMap){
        Integer intId = Integer.parseInt(id);
        Cart cart = cartService.findbyID(intId);
        cartService.Delete(cart);

        Cart cart1 = new Cart();
        modelMap.addAttribute("cartObj",cart1);

        List<Cart>cartList = cartService.findAll();
        modelMap.addAttribute("cartList",cartList);
        modelMap.addAttribute("saveFlag",true);

        return "Cart";
    }
}
