/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.datatypes;

/**
 *
 * @author rock and roll
 */
public class DataTypePractice {
    public static void main(String[] args){
        
        System.out.println("Integer range:");
        System.out.println(Integer.MAX_VALUE);
        
        System.out.println(Integer.MIN_VALUE);
        //Integer is a wrapper class for integer
        
        System.out.println("Double range:");
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        
        String price = "100";
        int priceValue = Integer.parseInt(price);
        System.out.println("Price: "+priceValue);
        
    }
    
}
