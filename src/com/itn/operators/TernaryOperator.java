/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.operators;

/**
 *
 * @author rock and roll
 */
public class TernaryOperator { 
    
    public static void main(String[] args){
        int a=10;
        int b=20;
        int taller = (a>b)? (a-b) : (b-a) ;
        System.out.println("the difference in height: "+taller);
        
        boolean taller1 = (a>b)? true : false ;
        System.out.println("A is taller than B? : "+taller1);
    }
    
}
