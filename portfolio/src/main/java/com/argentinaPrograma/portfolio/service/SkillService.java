/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.Skill;
import com.argentinaPrograma.portfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements iSkillService{
    
    private SkillRepository skillRepo;
    
    @Autowired
    public SkillService(SkillRepository skillRepo){
        this.skillRepo = skillRepo;
    }

    @Override
    public List<Skill> verSkill() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void crearSkill(Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void borrarSkill(Long skillId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Skill buscarSkill(Long skillId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
