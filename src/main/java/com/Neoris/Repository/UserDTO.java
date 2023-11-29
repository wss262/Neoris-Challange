/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Neoris.Repository;

/**
 *
 * @author seba_
 */
public class UserDTO {
    private String name;
    private String email;
    private String password;
    private PhonesDTO phonesDTO;

    public UserDTO() {
    	
    }
    
    public UserDTO(String name, String email, String password, PhonesDTO phonesDTO) {   	
        this.name = name;
        this.email = email;
        this.password = password;
        this.phonesDTO = phonesDTO;
    }

    public String getName() {
        return name;
    }


    public UserDTO setName(String name) {
        this.name = name;
        return this;
    }


    public String getEmail() {
        return email;
    }


    public UserDTO setEmail(String email) {
        this.email = email;
        return this;

    }

    public String getPassword() {
        return password;
    }


    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }
    
    public PhonesDTO getPhonesDTO() {
        return phonesDTO;
    }

    public UserDTO setPhonesDTO(PhonesDTO phonesDTO) {
        this.phonesDTO = phonesDTO;
        return this;
    }
    
}


