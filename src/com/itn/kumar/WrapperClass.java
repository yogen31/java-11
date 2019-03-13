/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.kumar;

/**
 *
 * @author rock and roll
 */
public class WrapperClass {
 
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("10101",2);
        int a = Integer.parseInt("123");
        int c =i1.intValue();
        System.out.println("c="+c);
        System.out.println("a="+a);
        
    }
}
