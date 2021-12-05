package com.goodcoder.controller;

import com.goodcoder.model.User;
import com.goodcoder.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService UserService;
    
    @GetMapping("login")
    public String login(){
        return "account/login";
    }
    // @PostMapping("login")
    // public String loginCheck(){

    //     return "";
    // }
    @GetMapping("register")
    public String register(){
        return "/account/register";
    }
    @PostMapping("register")
    public String register(User user){
        UserService.save(user);
        return "redirect:/";
    }
}
