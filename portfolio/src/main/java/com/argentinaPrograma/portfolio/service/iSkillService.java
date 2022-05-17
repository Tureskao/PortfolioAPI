/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.Skill;
import java.util.List;

/**
 *
 * @author Tureskao
 */
public interface iSkillService {
    
    public List <Skill> verSkill();
    public void crearSkill(Skill skill);
    public void borrarSkill(Long skillId);
    public Skill buscarSkill(Long skillId);
    
}
