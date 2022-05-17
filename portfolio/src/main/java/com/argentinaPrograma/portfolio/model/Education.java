package com.argentinaPrograma.portfolio.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
