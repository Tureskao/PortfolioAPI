/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.Project;
import java.util.List;

/**
 *
 * @author Tureskao
 */
public interface iProjectService {
    
    public List <Project> verProject();
    public void crearProject(Project proj);
    public void borrarProject(Long projId);
    public Project buscarProject(Long projId);
    
}
