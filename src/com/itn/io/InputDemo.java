/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author rock and roll
 */
public class InputDemo {
    public static void main(String[] args) {
        String path = "c:/Users/rock and roll/Desktop/src.txt";
        
        java.io.File file = new java.io.File(path);
        
        if (file.exists()) {
            System.out.println("File exists!");
            System.out.println("DIR: "+file.isDirectory());
            System.out.println("File: "+file.isFile());
            System.out.println("Size in KB: "+file.length());    
        }
       //stream based input operation
       FileInputStream fis=null;
       //declaring fis outside try block for proper closing of fis
       try{
        fis= new FileInputStream(file);
//          FileInputStream fis= new FileInputStream(file);
       //opens a file resource for input operation
       //perfotm some task on open resource
       int i;
       while((i=fis.read()) != -1){
           //-1 is end of stream value
           System.out.print((char)i);
       }
       }
       catch(FileNotFoundException e){
           System.out.println(e);
       }
       catch(IOException e){
           System.out.println(e);
       }
       finally{
       //close that resource
       try{
       fis.close();
       }
       catch(IOException e){
           System.out.println(e);
       }
       }
    }
    
}
