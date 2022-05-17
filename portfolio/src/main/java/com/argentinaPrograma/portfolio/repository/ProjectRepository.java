
package com.argentinaPrograma.portfolio.repository;

import com.argentinaPrograma.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository <Project,Long> {
    
}
