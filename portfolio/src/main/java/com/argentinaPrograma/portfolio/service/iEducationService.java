/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.Education;
import java.util.List;

/**
 *
 * @author Tureskao
 */
public interface iEducationService {
    
    public List <Education> verEducation();
    public void crearEducation(Education edu);
    public void borrarEducation(Long eduId);
    public Education buscarEducation(Long eduId);
    
}
