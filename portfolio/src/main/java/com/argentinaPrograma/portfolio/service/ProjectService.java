
package com.argentinaPrograma.portfolio.service;

import com.argentinaPrograma.portfolio.model.Project;
import com.argentinaPrograma.portfolio.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements iProjectService {
    
    
    private ProjectRepository projRepo;
    
    @Autowired
    public ProjectService(ProjectRepository projRepo){
        this.projRepo = projRepo;
    }
    
    @Override
    public List<Project> verProject() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void crearProject(Project proj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void borrarProject(Long projId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Project buscarProject(Long projId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
