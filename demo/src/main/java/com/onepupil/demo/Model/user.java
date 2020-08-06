package com.onepupil.demo.Model;

import org.springframework.data.annotation.Id;

public class user {

    private String name;
    private String email;
    private String password;
    private int mileage;

    public user(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPass(String password){
        this.password = password;
    }
    public void setMiles(int mi){
        this.mileage = mi;
    }
    public void addMiles(int miles){
        this.mileage += miles;
    }
    public String getName(){
        return this.name;   
    }
    public String getEmail(){
        return this.email;
    }
    public String getPass(){
        return this.password; 
    }
    public int getMiles(){
        return this.mileage;
    }

}