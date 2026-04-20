package com.yadavtech.UserAuthService.service;

import com.yadavtech.UserAuthService.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public String registerUser(User user);
}
