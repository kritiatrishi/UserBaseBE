package com.secondarysystem.userbase.service;
//why interface?

import com.secondarysystem.userbase.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();

    //List<User> updateUsers();
}
