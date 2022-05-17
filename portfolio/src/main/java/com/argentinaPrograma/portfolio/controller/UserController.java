package com.argentinaPrograma.portfolio.controller;

import com.argentinaPrograma.portfolio.model.User;
import com.argentinaPrograma.portfolio.service.iUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*Por el momento este es el único controlador que está implementado (a medias)*/
/*Las consultas son:
-> [POST] .../new/user; pide los datos del user en formato JSON en el body de 
la request. Los datos implementados por el momento son:
{
    "userId" : "",
    "userName" : "",
    "userPassword" : "",
    "userRealName" : "",
    "userTitle" : "",
    "userImgUrl" : ""
}

-> [POST] .../delete/user/id; Pide solo el número de id en el body de la request 
y elimina al usuario con el id correspondiente de la tabla.

-> [GET] .../ver/users; Retorna una lista con todos los usuarios registrados en
la base de datos

-> [GET] .../ver/user/{id}; Dado un id, retorna el usuario con dichos datos
*/

@RestController
public class UserController {
    
    @Autowired
    private iUserService userServ;
    
    @PostMapping("/new/user")
    public void crearUser(@RequestBody User usr){
        userServ.crearUser(usr);
    }
    
    @PostMapping("/delete/user/id")
    public void borrarUser(@RequestBody Long idUsr){
        userServ.borrarUser(idUsr);
    }
    
    @GetMapping("/ver/users")
    public List<User> verUsers()
    {
        return userServ.verUser();
    }
    
    @GetMapping("/ver/user/{id}")
    public User verUserId(@PathVariable Long userId)
    {
        return userServ.verUserId(userId);
    }
    
    
}
