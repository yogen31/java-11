/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

/**
 *
 * @author rock and roll
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
       //instanciatintg box object by new keyword using defaut constructor
       b1.showBox();
       //displays a default initialized values for instance variable
        System.out.println();
        //assign values for insatnce variables of object b1
        //instance variables are created only when objects are being created
        //in heap memory
        //individuals objects has there own seperate set of instance variables
        b1.l = 12;
        b1.b = 8;
        b1.h = 5;
         
        //when we call a non-static method we use a reference of a object
        //so it could perform some action upon that object 
        //and it is a part of class design to 
        //from within the non-static method the we are able to access instance variables of an object
        //which is used to access that method
        b1.showVolume();
        
        b1.showBox();
        b1.openBox();
        
        Box b2 = new Box();
        b2.l = 20;
        b2.b = 80;
        b2.h = 90;
        b2.showVolume();
        b2.showBox();
        b2.openBox();
        
        
        
        
    }
    
}
