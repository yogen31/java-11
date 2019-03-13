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
public class RelationalOperator {
    public static void main(String[] args){
        
        int a = 10;
        int b = 20;
        //relational operator is used to compare two operands
        System.out.println("first value is greater than second: "+(a > b));
        //result of relational operation is a boolean value(true/false)
        System.out.println("First is less than second: "+(a < b));
        System.out.println("First is equals to second: "+(a == b));
        //only used to compare values and primitive variables
        System.out.println("First is not equal to second: "+(a != b));
        System.out.println("First is greater than equals to second: "+(a >= b));
        System.out.println("First is less than equal to second: "+(a <= b));
        
    }
    
}
