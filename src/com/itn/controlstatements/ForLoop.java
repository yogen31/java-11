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
public class ForLoop {
    public static void main(String[] args) {
        //for(initialization;condition_check;increment/decrement){}
        //for (;;) {
          //  System.out.println("*");
          //goes on infinite loop}
          int i=0;
          for( ; i<10; ){
              System.out.println(i++);
          }
          for (int j = 0; j<5; j++) {
         //j is local inside for block   
        }
          for (int j = 0; j<5; j++) {
             //j is local inside for block 
              System.out.println(j);
        }
          for(int j=0;j<5;j++){
              for(int k=0;k<5;k++){
                  System.out.println(j+","+k);
              }
          }
          
        
    }
    
}
