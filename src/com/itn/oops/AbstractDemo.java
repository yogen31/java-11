/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

/**
 *
 * @author rock and roll
 */
public abstract class AbstractDemo {
    
    public String key;
    public int value;
    
    public AbstractDemo(String key,int value){
        this.key = key;
        this.value = value;
    }
    public void get(){
        System.out.println("Key: "+key);
        System.out.println("Value: "+value);
    }
    public abstract void set();
    
    
}
