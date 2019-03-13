/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.arrays;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a,b;
        //declaring an array
        //initialization of an array
        a = new int[4];
        b = new int[3];
        //new is a keyword which creates a memory location for 4 integers in case of array a;
        //once created the size of a-array cannot be changed
        
        System.out.println(a[0]);
        //an array will be initialized with a default value
        //assigning a value to array elements
        System.out.println("Enter value for first array element ");
        b[0] = 12;
        b[1] = 43;
        b[2] = 55;
        
        //b[3] = 32;
        //index 3 represents 4th element 
        //in our array we only have three elements 
        //so there is no 4th element which violates access rule 
        //and causes exception to be thrown
        
        Scanner sc = new Scanner(System.in);
        //using for-loop to assign values for all array elements
        for(int i=0; i<4 ; i++){
            System.out.println("Enter array element "+(i+1)+":");
            a[i] = sc.nextInt();
            
           
        }
        
        //we cannot use foreach-loop to assign a value for array elements
        //though we can use it to access the array
        for(int i:a){
            System.out.print(i+"\t");
        }
    }
}
