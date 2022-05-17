/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.User;
import java.util.List;

/**
 *
 * @author Tureskao
 */
public interface iUserService {
    
    public List <User> verUser();
    public User verUserId(Long userId);
    public void crearUser(User user);
    public void borrarUser(Long userId);

    
    
}
