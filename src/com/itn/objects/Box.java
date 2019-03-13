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
public class Box {
    // instance variables 
    int l, b, h;
    //class variables
    static String brand = "ABC Manufacturers ";
    
    // behaviours or methods 
    public void showVolume(){
        System.out.println("The volume is: "+(l*b*h));
    }
    public void openBox(){
        System.out.println("Box opened.");
    }
    public void showBox(){
        System.out.println("Box details:");
        System.out.println("Length: "+l);
        System.out.println("Breadth: "+b);
        System.out.println("Height: "+h);
        System.out.println("Company: "+brand);
    }
}
