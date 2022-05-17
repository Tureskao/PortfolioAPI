package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.Education;
import com.argentinaPrograma.portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EducationService implements iEducationService {
    
    private final EducationRepository eduRepo;
    
    @Autowired
    public EducationService(EducationRepository eduRepo){
        this.eduRepo = eduRepo;
    }
    
    /*Metodos CRUD*/

    @Override
    public List<Education> verEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducation(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducation(Long eduId) {
        eduRepo.deleteById(eduId);
    }

    @Override
    public Education buscarEducation(Long eduId) {
        return eduRepo.findById(eduId).orElse(null);
    }
    
}
