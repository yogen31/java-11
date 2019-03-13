/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

/**
 *
 * @author rock and roll
 */
public interface ScientificCalculator {
    
    public void exponential();
    public void log();
    
    public default void powerOn(){
        System.out.println("powered on!");
    }
    public default void powerOff(){
        System.out.println("powered off!");
    }
}
