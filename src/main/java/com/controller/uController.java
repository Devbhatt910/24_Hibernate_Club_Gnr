package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.uEntity;
import com.repository.uRepo;

@Controller
public class uController {

    @Autowired
    uRepo userRepo;
    
    @GetMapping("/newuser")
    public String newUser(){
        return "NewUser";
    }

    @PostMapping("/createUser")
    public String createUser(uEntity userEntity){
        userRepo.save(userEntity);
        return "NewUser";
    }

    @GetMapping("/listusers")
    public String listUsers(Model model){

        List<uEntity> users = userRepo.findAll();
        model.addAttribute("users", users);
        return "listUsers";
    }

    @GetMapping("/deleteuser")
    public String deleteUsers(uEntity userEntity){
        
        return ":redirect/listusers";
    }

}
