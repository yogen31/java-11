/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.operators;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc= new Scanner(System.in); // single equals is an assignment operator
                                            //double equals is a relational operator
        
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        
        
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        System.out.println("The sum is: "+(num1+num2));//arithmetic plus operator
        System.out.println("The difference is: "+(num1-num2));
        System.out.println("The product is : "+(num1 * num2));
        System.out.println("The Dividennt is: "+(num1 / num2));
        System.out.println("The remainder is: "+(num1 % num2)); // modulo operator
    }
}
