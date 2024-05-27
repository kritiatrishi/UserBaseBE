package com.secondarysystem.userbase.controller;

import com.secondarysystem.userbase.model.User;
import com.secondarysystem.userbase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/add",headers = "Accept=application/json")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New user registered successfully";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }


}
