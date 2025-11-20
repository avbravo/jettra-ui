/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jettraui.ui.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author avbravo
 */
public class JettraModelSession implements Serializable{
private static final long serialVersionUID = 1L;
    Boolean isAuthentication;
    Boolean hasAuthorization;
    String username;
    String name;
    Long iduser;
    String userRol;
    Long idRol;
   String primaryBtnClass;
    String secondaryBtnClass;
    String cssFramework;
    Boolean isTailwind = Boolean.FALSE;
  

    public JettraModelSession() {
    }

    public JettraModelSession(Boolean isAuthentication, Boolean hasAuthorization, String username, String name, Long iduser, String userRol, Long idRol, String primaryBtnClass, String secondaryBtnClass, String cssFramework) {
        this.isAuthentication = isAuthentication;
        this.hasAuthorization = hasAuthorization;
        this.username = username;
        this.name = name;
        this.iduser = iduser;
        this.userRol = userRol;
        this.idRol = idRol;
        this.primaryBtnClass = primaryBtnClass;
        this.secondaryBtnClass = secondaryBtnClass;
        this.cssFramework = cssFramework;
    }

    public String getPrimaryBtnClass() {
        return primaryBtnClass;
    }

    public void setPrimaryBtnClass(String primaryBtnClass) {
        this.primaryBtnClass = primaryBtnClass;
    }

    public String getSecondaryBtnClass() {
        return secondaryBtnClass;
    }

    public void setSecondaryBtnClass(String secondaryBtnClass) {
        this.secondaryBtnClass = secondaryBtnClass;
    }

    public String getCssFramework() {
        return cssFramework;
    }

    public void setCssFramework(String cssFramework) {
        this.cssFramework = cssFramework;
    }

    public Boolean getIsTailwind() {
        return isTailwind;
    }

    public void setIsTailwind(Boolean isTailwind) {
        this.isTailwind = isTailwind;
    }

 

    public Boolean getIsAuthentication() {
        return isAuthentication;
    }

    public void setIsAuthentication(Boolean isAuthentication) {
        this.isAuthentication = isAuthentication;
    }

    public Boolean getHasAuthorization() {
        return hasAuthorization;
    }

    public void setHasAuthorization(Boolean hasAuthorization) {
        this.hasAuthorization = hasAuthorization;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getUserRol() {
        return userRol;
    }

    public void setUserRol(String userRol) {
        this.userRol = userRol;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.isAuthentication);
        hash = 67 * hash + Objects.hashCode(this.hasAuthorization);
        hash = 67 * hash + Objects.hashCode(this.username);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.iduser);
        hash = 67 * hash + Objects.hashCode(this.userRol);
        hash = 67 * hash + Objects.hashCode(this.idRol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JettraModelSession other = (JettraModelSession) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.userRol, other.userRol)) {
            return false;
        }
        if (!Objects.equals(this.isAuthentication, other.isAuthentication)) {
            return false;
        }
        if (!Objects.equals(this.hasAuthorization, other.hasAuthorization)) {
            return false;
        }
        if (!Objects.equals(this.iduser, other.iduser)) {
            return false;
        }
        return Objects.equals(this.idRol, other.idRol);
    }

    @Override
    public String toString() {
        return "ModelSession{" + "isAuthentication=" + isAuthentication + ", hasAuthorization=" + hasAuthorization + ", username=" + username + ", name=" + name + ", iduser=" + iduser + ", userRol=" + userRol + ", idRol=" + idRol + '}';
    }

   
    
   

}
