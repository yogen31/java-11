/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.operators;

/**
 *
 * @author rock and roll
 */
public class BitwiseLogicalOperators {
    public static void main(String[] args){
        int a = 101;
        int b = 85;
        //bitwise logical operations
        System.out.println("Bitwise logical-AND operation: "+(a & b));
         System.out.println("Bitwise logical-OR operation: "+(a | b));
         System.out.println("Bitwise logical-COMPLIMENT operation: "+(~a));
         
         //shift operators
         System.out.println("Bitwise left-shift operation of "+a+" is "+(a<<1));//multiply by 2
         System.out.println("Bitwise right-shift operation of "+a+" is "+(a>>1));//divide by 2 and ignores point value
         System.out.println("Bitwise left-shift 2-bit and update operand of "+a+" is "+(a<<=2));
         System.out.println("Bitwise right-shift 2-bit and update operand of "+a+" is "+(a>>=2));
         
    }
}
