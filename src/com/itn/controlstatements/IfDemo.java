/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controlstatements;

/**
 *
 * @author rock and roll
 */
public class IfDemo {
    public static void main(String[] args) {
        boolean bool = false;
        // if control structure is used to decide to execute a block of statements or not
        if(bool){
            System.out.println("This code never gets execute ..");
        }
        if(!bool){
            System.out.println("This code is always executed..");
        }
    }
    
}
