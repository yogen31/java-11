/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

/**
 *
 * @author rock and roll
 */
public class AccessModifier {
    public int a;
    protected int b;
    int c;
    //default access if not mentioned any other access specifier
    private int d;
    
    public AccessModifier(){
        //constructor of class
        //default constructor
        a=10;
        b=11;
        c=12;
        d=13;
        //assigning our own default values through default constructor
        //otherwise it would take a jvm pprovided default values
        //which is 0for integer numbers,0.0 for floating,null for String 
    }
    //Every class in java has an implicit parent class Object which has a method
    //toString which we re-defined by overriding in this class
    
    @Override
    public String toString(){
        return "a="+a+",b="+b+", c="+c+", d="+d;
    }
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        am.toString();
        System.out.println(am.toString());
        am.a = 20;
        am.b = 30;
        am.c = 40;
        am.d = 50;
        //all private default protected and public members
        //are accessible within a class
        System.out.println(am.toString());
    }
    
}
