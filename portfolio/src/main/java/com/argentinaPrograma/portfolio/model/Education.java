package com.argentinaPrograma.portfolio.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Education {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long educId;
    
    @Basic
    private String educInstitutionName;
    private String educDegreeName;
    
    private Date educStartDate;
    private Date educFinishDate;
    
    
   
}
