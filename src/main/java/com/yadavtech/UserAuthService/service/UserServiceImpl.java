package com.yadavtech.UserAuthService.service;

import com.yadavtech.UserAuthService.entity.User;
import com.yadavtech.UserAuthService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String registerUser(User user) {
        userRepository.save(user);
        return  "You are Registered";
    }
}
