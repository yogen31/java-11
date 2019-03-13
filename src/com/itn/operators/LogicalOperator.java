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
public class LogicalOperator {
    public static void main(String[] args){
        // & | !
        boolean b1 = true;
        boolean b2 = false;
        
        System.out.println("Logical-AND operation: "+(b1 & b2));
        System.out.println("Logical-OR operation: "+(b1 | b2));
        System.out.println("Logical-NOT operation: "+(!b1));
        System.out.println("Logical-XOR operation: "+(b1 ^ b2));
        //XOR returns true if operands are odd valued
        
        //logical short circuit opearator
        int a=10,b=20,c=30;
        if((a>b)&&(a<c++)){
            
            //a>b returns false 
            //for and operationn if one operand is false then the total outcome can be evaluated as false
            //our left side is false so we dont reach our right side to evaluate c++
            System.out.println("Operation performed");
        }
        System.out.println(c);
        
    }
    
}
