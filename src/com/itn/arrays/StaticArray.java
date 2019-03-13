/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.arrays;

/**
 *
 * @author rock and roll
 */
public class StaticArray {
    public static void main(String[] args) {
        //declaration of an array
        int[] odds = {1,3,5,7,9};
        //statically created array
        
        char vowels[] = {'a','e','i','o','u'};
        //arrays could be made of any data type
        //primitive,Non-primitive or UserDefined
        
        //accessing an array using its index value
        //index specifies position of an array element
        //the index always starts from 0 upto length-1
        //length is the size of array
        System.out.println("First vowel of english alphabet: "+ vowels[0]);
        //array_var[INDEX] == here index 0 means first element
        //we can have a random access to an array element
        System.out.println(odds[3]);
        System.out.println(odds[0]);
        //accessing all elements of an array using for-loop
        //here i is used as an index variable which is initialized with 0
        //aaray.length gives a length or size of an array
        
        for(int i=0; i<odds.length; i++ ){
            System.out.println(odds[i]);
            
        
        }
        //foreach-loop is specially designed to work for array or similar colletions
        for(char c: vowels){
            //for each char c in array vowels
            System.out.print(c +"\t");
        }}
    
}
