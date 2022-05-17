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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projId;
    
    @Basic
    private String projTitle;
    private String projDescription;
    private String projUrl;
    private int projDate;
    private String projImgUrl;

    public Project() {
    }

    public Project(Long projId, String projTitle, String projDescription, String projUrl, int projDate, String projImgUrl) {
        this.projId = projId;
        this.projTitle = projTitle;
        this.projDescription = projDescription;
        this.projUrl = projUrl;
        this.projDate = projDate;
        this.projImgUrl = projImgUrl;
    }
    
    
}
