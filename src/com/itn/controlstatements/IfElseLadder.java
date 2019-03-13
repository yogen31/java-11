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
public class IfElseLadder {
    public static void main(String[] args) {
        int marks;
        //shows grade for given marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your marks(0-100): ");
        marks = sc.nextInt();
        
        //check the marks entered is valid or not
        if((marks>=0) && (marks<=100) ){
            System.out.println("Valid mark entered.....");
            //do some additional decision making
            //nesting if inside another if
            if(marks>=80){
                //80-100 range
                System.out.println("Your grade is A+.");
            }
            else if(marks>=60){
                System.out.println("Your grade is A.");
            }
            else if(marks>=45){
                System.out.println("Your grade is B.");
            }
            else if(marks>=30){
                System.out.println("Your grade is C.");
            }
            else{
                System.out.println("You are not graded");
            }
        }
        else{
            System.out.println("Invalid mark entered....");
        }
    }
    
}
