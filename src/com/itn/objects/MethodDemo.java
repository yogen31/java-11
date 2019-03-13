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
public class MethodDemo {
    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter Second number:");
        int b = sc.nextInt();
        
        System.out.println("The sum is : "+(a+b));
    }
    public int sum(int a,int b){
        return a+b;
    }
    //third method is same as second method AS THEY BOTH HAVE SAME SIGNATuRE
    //1.they both have same name
    //2.they both have same number of parameter of same type.
    //3. they have different return type but it doesnot change its signature
    //so both methods are considered same method which java won't allow
//    public void sum(int x, int y) {
//        System.out.println("the sum is: " + (x + y));
//    }
    public void sum(double a, double b){
        System.out.println("The sum is : "+(a+b));
        
    }
    //same method name used for different methods (that differ in signature)
    //is considered method overloading
    public static void main(String[] args) {
        MethodDemo md = new MethodDemo();
        md.sum();
        //no parameter method called 
        
        int sum = md.sum(10,20);
        System.out.println("SUM is: "+sum);
        //sum method with two integer parameter called 
        
        md.sum(12.00,14.00);
        //calls sum method with double parameters
        
    }
}
