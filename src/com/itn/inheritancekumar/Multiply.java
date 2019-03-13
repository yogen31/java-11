/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.inheritancekumar;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class Multiply extends Add{
    private int b,multiply;
    Scanner sc=new Scanner(System.in);
    public void getb(){
        System.out.println("Enter b: ");
        b=sc.nextInt();
        
    }
    public void multiply(){
        multiply = b*sum();
        System.out.println("Multiplication is: "+multiply);
        
        
    }
   
    
    
    
}
