package com.argentinaPrograma.portfolio.model;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User {
    @Id
    @GeneratedValue()
    private Long userId;
    
    @Basic
    private String userName;
    private String userPassword;
    private String userRealName;
    private String userTitle;
    private String userImgUrl;
    
    @OneToMany(mappedBy="educId")
    private List<Education> educList;
    
    @OneToMany(mappedBy="skillId")
    private List<Skill> skillList;
    
    @OneToMany(mappedBy="expId")
    private List<Experience> expList;
    
    @OneToMany(mappedBy="projId")
    private List<Project> projList;

    public User() {
    }

    public User(Long userId, String userName, String userPassword, String userRealName, String userTitle, String userImgUrl, List<Education> educList, List<Skill> skillList, List<Experience> expList, List<Project> projList) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRealName = userRealName;
        this.userTitle = userTitle;
        this.userImgUrl = userImgUrl;
        this.educList = educList;
        this.skillList = skillList;
        this.expList = expList;
        this.projList = projList;
    }
    
    
    
}
