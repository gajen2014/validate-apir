package com.validate.controller;

import com.validate.entity.User;
import com.validate.exception.ResourceNotFoundException;
import com.validate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value="id") long userID){
        return this.userRepository.findById(userID)
                .orElseThrow(()-> new ResourceNotFoundException("User not found with id : "+ userID));
    }


}
