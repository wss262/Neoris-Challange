/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Neoris.Repository;

/**
 *
 * @author seba_
 */
public class PhonesDTO {
    private String number;
    private String citycode;
    private String countrycode;    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
   
    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    } 
    
    public String getCountrycode() {
        return countrycode;
    }
    
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }   
    
}
