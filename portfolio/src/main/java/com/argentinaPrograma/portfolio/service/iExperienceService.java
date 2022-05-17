/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaPrograma.portfolio.service;


import com.argentinaPrograma.portfolio.model.Experience;
import java.util.List;

/**
 *
 * @author Tureskao
 */
public interface iExperienceService {
    
    public List <Experience> verExperience();
    public void crearExperience(Experience exp);
    public void borrarExperience (Long expId);
    public Experience buscarExperience(Long expId);
    
    /*
    public List <Model> verModel();
    public void crearModel(Model variable);
    public void borrarModel(Long variableId);
    public Model buscarModel(Long variableId);
    
    */
}
