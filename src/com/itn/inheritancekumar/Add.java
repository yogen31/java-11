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
public class Add extends Calculate {
    private int c,sum; 
    Scanner sc= new Scanner(System.in);
    public int getc(){
         System.out.println("Enter the value of c");
       c=sc.nextInt();
       return c;
    }
     
   public int sum(){
      
       sum = c+setdata();
       System.out.println("Sum is : "+sum);
       return sum;
   
       
        
    }
        
    }
   
  

