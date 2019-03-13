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
public class SwitchPractice {
    public static void main(String[] args) {
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        day = sc.next().toLowerCase();
        
        switch(day){
            case "sunday":
                System.out.println("Start of a week day..");
                break;
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
                System.out.println("Mid week day..");
                break;
            case "friday":
            case "saturday":
                System.out.println("Week end..");
                break;
            default:
                System.out.println("Wrong day entered..");
                break;
                       
        }
    }
        
}
