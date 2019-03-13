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
public class DynamicArray {
    public static void main(String[] args) {
        int[] dyna;
        int n;
        Scanner sc = new Scanner(System.in);
        //creating and initializing an array with given size during run time
        System.out.println("Enter size of an array:");
        n = sc.nextInt();
        
        dyna = new int[n];
        //array of size n is created at run time
        for(int i=0;i<n;i++){
            System.out.println("dyna["+i+"]:");
            dyna[i] = sc.nextInt();
        }
        for(int i:dyna){
            
            System.out.print(i+"\t");
        }
    }
    
}
