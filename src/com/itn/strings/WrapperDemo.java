/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.strings;

/**
 *
 * @author rock and roll
 */
public class WrapperDemo {
    public static void main(String[] args) {
        int i=10;
        
        //i.X ie. no other functionalities are available with premitive type
        //we use premitive type only to create variable 
        //and store data of that type
        
        Integer a = new Integer(10);
        Integer b = i;//auto-boxing
        System.out.println(b.toString());
        
        System.out.println(b=Integer.parseInt("100"));//returns into primitive form
        
        a=Integer.valueOf("100");//returns into class form
        i = a;//auto-unboxing
        
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        
        
        
    }
}
