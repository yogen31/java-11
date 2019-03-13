/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.exceptionhandling;

/**
 *
 * @author rock and roll
 */
public class CompiletimeDemo {
    public static void main(String[] args) {
        try{
        Class c = Class.forName("com.itn.objects.Boxa");
        //generates compile time exception
        //forced to handle by java compiler
            System.out.println("Inside try block..");
        }
        catch(Exception e){
            //inside catch block exception object is refered as e
        //    e.printStackTrace();// it is printed from different thread
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        //some other task after try-catch block
        //is executed if exception handling is done
        //and even if exception occurs
        System.out.println("Normal flow of  program execution...");//it is printed from main thread
    }
    
}
