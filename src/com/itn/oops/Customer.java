/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

import java.time.LocalDate;

/**
 *
 * @author rock and roll
 */
public class Customer {
    // hide data from direct access and modification 
    private int id;  // getter: getId()
    private String name;
    private String address;
    private LocalDate dob;
    private char gender;
    
    public Customer(){
        //default condtructor 
    } 
    public Customer(int id, String name, String address,LocalDate dob, char gender){
        this.id = id;
        this.name=name;
        this.address=address;
        this.dob=dob;
        this.gender=gender;
    }
    
    //read fields using getter method
    public int getId(){
        return id;
        
    }
    public String getName(){
        return name;
    }
    public String getAddressi(){
        return address;
    }
    public LocalDate getDob(){
        return dob;
    }
    public char getGender(){
        return gender;
    }
    //write to fields using setter methods
    
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setDob(LocalDate dob){
        this.dob=dob;
    }
    public void setGender(char gender){
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + '}';
    }
    
}
