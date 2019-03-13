/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.datatypes;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class DataTypeDemo {
    public static void main(String[] args){
        
        //declaring local variables
        byte b1;//variable declaration
        //declared local variable should be initialized befpore using it
        b1 = 100;// variable b is initialized with literal value 100;
        
        byte b2 = 0b01010101;//variable declaration and initialization
        //byte type variables initialized with binary value;
        
        byte b3;
            System.out.println("Enter value for b3 in binary sequence:");
            Scanner sc = new Scanner(System.in);
            // b3 = sc.nextByte();
            //inputs as a regular numeric value
            b3 = sc.nextByte(2);
            //to input a binary sequence
            System.out.println(b3);
            byte b4 = 0x7f;//to initialze with hexadecimal value
            // 01111111
            short s1 = 32767;//value range
            System.out.println(s1);
            
            int i =  2_147_481_299;//integer is default literal
            //underscore is allowed for representing comma in currency or numbers;
            
            long l = 2_382_828_282_828_288L;
            
            float f = 19.57f;// double is default literal
            //float type variable f is assigned with float literal 19.57f
           
            //float f1 = 0.3476377766f;
            
            float f1 = 1.445678889E38f;
            
            System.out.println(f1);
            
            double d = 0.5538327387328322; //default is double literal for floating point number
            System.out.println(d);
            char c1 = 'a';
            char c2 = 98; // ascii equivalent
            char c3 = '\u2325';//unicode character
            char c4=2325;
            
            System.out.println((int)c1);//number from char
            System.out.println(c2);//char from number
            System.out.println(c3);
            System.out.println(c4);
            
            boolean bool = true;
            System.out.println(bool);
       
    }
}
