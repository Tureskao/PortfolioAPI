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
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long expId;
    
    @Basic
    private String expTitle;
    private String expDescription;
    private String expUrl;
    private int expDate;
    private String expImgUrl;  

    public Experience() {
    }

    public Experience(Long expId, String expTitle, String expDescription, String expUrl, int expDate, String expImgUrl) {
        this.expId = expId;
        this.expTitle = expTitle;
        this.expDescription = expDescription;
        this.expUrl = expUrl;
        this.expDate = expDate;
        this.expImgUrl = expImgUrl;
    }
    
    
    
}