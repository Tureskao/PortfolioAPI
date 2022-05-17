/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.User;
import com.argentinaPrograma.portfolio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tureskao
 */
@Service
public class UserService implements iUserService {
    
    private UserRepository userRepo;
    
    @Autowired
    public UserService(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public List<User> verUser() {
        return userRepo.findAll(); 
    }

    @Override
    public void crearUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void borrarUser(Long userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public User verUserId(Long userId) {
        return userRepo.findById(userId).orElse(null);
    }
    
}
