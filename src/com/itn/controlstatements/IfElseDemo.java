/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controlstatements;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class IfElseDemo {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        // check if person is allowed to vote
        if(age>=18){
            System.out.println("You are allowed to vote");
            //if true if-block is executed
            
        }
        else{
            System.out.println("You are not allowed to vote");
            //if false else-block is executed
        }
    }
}
