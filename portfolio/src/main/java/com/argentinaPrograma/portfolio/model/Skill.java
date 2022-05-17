package com.argentinaPrograma.portfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long skillId;
    
    @Basic
    private String skillTitle;
    private String skillValue;

    public Skill() {
    }

    public Skill(Long skillId, String skillTitle, String skillValue) {
        this.skillId = skillId;
        this.skillTitle = skillTitle;
        this.skillValue = skillValue;
    }
    
    
}
