package com.magdemy.truecallerapi.controller;

import com.magdemy.truecallerapi.model.User;
import com.magdemy.truecallerapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("/getUserByPhone")
    public User getUserByPhone(@RequestBody Map<String, String> request){
        return userService.getUserByPhone(request.get("phone"));
    }

}
