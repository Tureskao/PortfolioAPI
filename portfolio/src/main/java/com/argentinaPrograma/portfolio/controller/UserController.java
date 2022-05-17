package com.argentinaPrograma.portfolio.controller;

import com.argentinaPrograma.portfolio.model.User;
import com.argentinaPrograma.portfolio.service.iUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private iUserService userServ;
    
    /*@PostMapping("/new/user")
    public void crearPersona(@RequestBody Persona per){
        persoServ.crearPersonas(per);
    }*/
    
    @GetMapping("/id/{id}")
    public List<User> verUser(
    @PathVariable("id") Long id)
    {
        return userServ.verUser();
    }
    
    
}
