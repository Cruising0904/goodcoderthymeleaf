package com.goodcoder.service;

import com.goodcoder.model.Role;
import com.goodcoder.model.User;
import com.goodcoder.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User save(User user){
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        // user.setPassword(user.getPassword());
        user.setEnabled(true);
        Role ro = new Role();
        ro.setId(1l);
        user.getRoles().add(ro);
        return userRepository.save(user);
    }
}
