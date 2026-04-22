package com.yadavtech.UserAuthService.controller;

import com.yadavtech.UserAuthService.entity.User;
import com.yadavtech.UserAuthService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<String> registerUser (@RequestBody User user){
        String response = userService.registerUser(user);
        return  ResponseEntity.ok(response);
    }

}
