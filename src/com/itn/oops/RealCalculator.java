/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class RealCalculator implements ScientificCalculator,BasicCalculator{
    public int a,b;
    
    

    @Override
    public void exponential() {
        Scanner x = new Scanner(System.in);
           System.out.println("enter a:");
        a = x.nextInt();
        System.out.println("Exponential of a= "+Math.exp(a));
    }

    @Override
    public void log() {
         Scanner x = new Scanner(System.in);
           System.out.println("enter a:");
        a = x.nextInt();
        System.out.println("log of a= "+Math.log(a));
        
    }

    @Override
    public void addition() {
        Scanner x = new Scanner(System.in);
           System.out.println("enter a:");
        a = x.nextInt();
        System.out.println("enter b:");
        b=x.nextInt();
        System.out.println("addition : "+(a+b));
        
    }

    @Override
    public void subtraction() {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        a = sc.nextInt();
        System.out.println("enter b:");
        b=sc.nextInt();
        System.out.println("Subtraction : "+(a-b));
             
        
    }

    @Override
    public void multiplication() {
        Scanner y = new Scanner(System.in);
           System.out.println("enter a:");
        a = y.nextInt();
        System.out.println("enter b:");
        b=y.nextInt();
        System.out.println("multiplication : "+(a*b));
    }
    public static void main(String[] args) {
        RealCalculator cl = new RealCalculator();
        cl.powerOn();
        cl.addition();
        cl.subtraction();
        cl.multiplication();
        cl.log();
        cl.exponential();
        cl.powerOff();
        
    }
    
}
