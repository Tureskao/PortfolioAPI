
package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.Experience;
import com.argentinaPrograma.portfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements iExperienceService {
    
   private ExperienceRepository expRepo;
    
    @Autowired
    public ExperienceService(ExperienceRepository expRepo){
        this.expRepo = expRepo;
    }

    @Override
    public List<Experience> verExperience() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void crearExperience(Experience exp) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void borrarExperience(Long expId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Experience buscarExperience(Long expId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
