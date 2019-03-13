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
public class AccessTest {
    public static void main(String[] args) {
        AccessModifier at = new AccessModifier();
        System.out.println(at.toString());
        at.a= 1;  //public is accessible from anywhere 
        at.b=2;  //protected has two level of access 1.package 2.Inheritance
        at.c=3; // default is accessible within a package
 //     at.d=4; 
        // d has private access in AccessModifier
        //d cannot be accessed from outside of class AccessModifier directly
        System.out.println(at.toString());
    }
}
