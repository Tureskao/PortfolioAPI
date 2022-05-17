
package com.argentinaPrograma.portfolio.repository;

import com.argentinaPrograma.portfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienceRepository extends JpaRepository <Experience,Long> {
    
}
