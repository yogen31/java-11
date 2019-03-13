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
public class WhilePractice {
    public static void main(String[] args) {
        char choice ='Y';
        Scanner sc = new Scanner(System.in);
        System.out.println("Student information center");
        System.out.println("_________________________");
        while(choice == 'Y'){
        System.out.println("Enter student detail");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Gender: ");
            String gender = sc.nextLine();
            
            System.out.println("Position: ");
            String position = sc.nextLine();
            System.out.println("Grade: ");
            int grade = sc.nextInt();
            
            System.out.printf("Student details: %s, %s, %d, %s \n",name,gender,grade,position);
            System.out.println("Enter another student detail?(Y/N): ");
            choice = sc.next().toUpperCase().charAt(0);
            //returns first character from word input
            //adding dummy input
            sc.nextLine();
            //consumes empty line so other nextline() command work properly
            
           
        }
        System.out.println("Thanks for using Student Information system..");
        
    }
    
}
