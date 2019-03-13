/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.core;

import com.itn.objects.AccessModifier;

/**
 *
 * @author rock and roll
 */
public class AccessTestSubclass extends AccessModifier{
    //AccessTestSubClass will inherit public and protected member
    //from AccessModifier class
     public static void main(String[] args) {
 //     AccessModifier  at = new AccessModifier();//this is not inheriting
         AccessTestSubclass at = new AccessTestSubclass();
       //inherited class object 
        //a class when beiing used from outside of its package must be imported
        //from that class
        //a constructor should also be declared as public for this case
        System.out.println(at.toString());
        
        at.a = 101;
        at.b = 102;  // b is accessible through inheritance only
        //at.c = 103;  //not in same packag
        //at.d = 104;  //not accessible otside class
        System.out.println(at.toString());
    }
    
    
}
