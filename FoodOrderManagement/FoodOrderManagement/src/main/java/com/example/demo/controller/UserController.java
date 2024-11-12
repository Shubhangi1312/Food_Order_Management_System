package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class UserController {
	
	   @Autowired
	    private UserService userService;

	    @PostMapping("/signup")
	    public User register(@RequestBody User user) {
	        return userService.register(user);
	    }

	    @PostMapping("/login")
	    public User login(@RequestBody User user) {
	        return userService.findByUsername(user.getUsername());
	    }
	}


