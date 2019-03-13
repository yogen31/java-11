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
public class IndexOutofBounds {
    public static void main(String[] args) {
        int[] odds = {1,3,5,7,9};
        
        String s= "Nepal";
        //display last of array and string 
        try{
            System.out.println("Last in array "+odds[4]);
            
            System.out.println("Last of string "+s.charAt(5));
            //both of these throws exception
            
        }
        catch(ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException e){
            //multi-catch block
            //child exception must be caught first
            System.out.println(e);
        }
        catch(Exception e){
            //parent exception catch block must appear after child exception block
            System.out.println(e);
        }
        
        
    }
    
}
