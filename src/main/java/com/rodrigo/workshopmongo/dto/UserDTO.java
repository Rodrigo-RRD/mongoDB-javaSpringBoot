package com.rodrigo.workshopmongo.dto;

import java.io.Serializable;

import com.rodrigo.workshopmongo.domain.User;

public class UserDTO implements Serializable{
    
    private String id;
    private String name;
    private String email;

    public UserDTO(){

    }

    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
