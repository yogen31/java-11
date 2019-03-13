/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.core;

import java.util.Scanner;
/**
 *
 * @author rock and roll
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println();//prints an empty line
        System.out.println("Hello World!");//prints a line with a string
       //print with command line argument
       System.out.print(args[0]+" ");
       System.out.print(args[1]);
       
       
       String name = null;//null is a literal that could be assigned to any type
        System.out.print("\n");
       System.out.println("Enter your name:");
       //console input 
       Scanner input = new Scanner(System.in);
       //Scanner is a class from java.util package for taking console input
       //Scanner class object is created using new Keyword for taking inputs
       //new Scanner(System.in)--> is a Scanner Constructor which creates an Scanner
       //it takes a parameter System.in which is a standard input stream
       name = input.nextLine();
       //inputs a line of string and places it in a String variable name
        System.out.println("Welcome user "+name);
    }
    
}
