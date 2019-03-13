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
public class SwitchDemo {

    //switch works for discrete values
    public static void main(String[] args) {
        //arithmetic calculation
        Scanner sc = new Scanner(System.in);

        char operator;
        int op1, op2;
        System.out.println("Enter operation to perform:(+,-,*,/,%)");
        operator = sc.next().charAt(0);// next() inputs a word

        System.out.println("Enter first number:");
        op1 = sc.nextInt();
        System.out.println("Enter second number:");
        op2 = sc.nextInt();
        switch (operator) {
            case '+':
                System.out.println("Result of addition is: " + (op1 + op2));
                break;
            //break breaks the execution for this block and exits the block
            case '-':
                System.out.println("Result of subtraction is: " + (op1 - op2));
                break;
            case '*':
                System.out.println("Result of multiplication is: " + (op1 * op2));
                break;
            case '/':
                System.out.println("Result of division is: " + (op1 / op2));
                break;
            case '%':
                System.out.println("Result of modulo is: " + (op1 % op2));
                break;
            default:
                System.out.println("Wrong operator selected..");
                break;

        };
    }

}
