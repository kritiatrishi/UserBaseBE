package com.secondarysystem.userbase.service;
//why class and interface both?

import com.secondarysystem.userbase.model.User;
import com.secondarysystem.userbase.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    //autowiring repo so it can be automatically injected

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

  //  @Override
 //   public User updateUsers() {
       // return userRepo.save(User user);
  //  }
}
