package com.magdemy.truecallerapi.service;

import com.magdemy.truecallerapi.model.User;
import com.magdemy.truecallerapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public String addUser(User user){
        try {
            userRepository.save(user);
            return "User added";
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "Some Error";
    }

    public User getUserByPhone(String phone){
        System.out.println(userRepository.getUserByPhone(phone));
        return userRepository.getUserByPhone(phone);
    }
}
