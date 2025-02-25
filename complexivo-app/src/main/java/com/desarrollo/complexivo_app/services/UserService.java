package com.desarrollo.complexivo_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.desarrollo.complexivo_app.models.User;
import com.desarrollo.complexivo_app.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;
    
    public User save(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return this.repository.save(user); 
    }

    

}
