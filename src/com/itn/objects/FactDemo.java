/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class FactDemo {
    public static long factorial(long i){
        if(i==1){
            return 1;
        }else{
            return i*factorial(i-1);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate factorial:");
        int i = sc.nextInt();
        long fact = FactDemo.factorial(i);//factdemo is used to call in another class
        System.out.println("Factorial value is "+fact);
    }
}
