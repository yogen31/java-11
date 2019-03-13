/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.strings;

/**
 *
 * @author rock and roll
 */
public class BufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("java core programming.");
        System.out.println(sb1.capacity());//(16*2)+2=34
        
        sb1.insert(5, "is a ");
        System.out.println(sb1);
    }
}
