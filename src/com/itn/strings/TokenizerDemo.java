/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.strings;

import java.util.StringTokenizer;

/**
 *
 * @author rock and roll
 */
public class TokenizerDemo {
    public static void main(String[] args) {
         String s1 = "one,two,three, , , four,five";
    
    StringTokenizer st = new StringTokenizer(s1);
    String delim = ",";
    while(st.hasMoreTokens()){
            System.out.println(st.nextToken(delim));
    }
    }
   
   
}

