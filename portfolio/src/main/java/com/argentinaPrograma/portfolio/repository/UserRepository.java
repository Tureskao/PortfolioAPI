
package com.argentinaPrograma.portfolio.repository;

import com.argentinaPrograma.portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User,Long>{
    
}
