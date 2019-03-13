/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author rock and roll
 */
public class DeSerializeDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("c:/Users/rock and roll/Desktop/employee.txt");
            ois= new ObjectInputStream(fis);
            Employee e = (Employee) ois.readObject();
            System.out.println("Id: "+e.getId());
            System.out.println("Name: "+e.getName());
            System.out.println("Salary: "+e.getSalary());
        }catch(FileNotFoundException |ClassNotFoundException fe){
            System.out.println(fe.getMessage());
        }
        catch(IOException ie){
            System.out.println(ie);
            
        }finally{
            try{
                if(ois!=null){
                    ois.close();
                }
                if(fis!= null){
                    fis.close();
                }
            } catch(IOException ie){
            System.out.println(ie);
            
        }
        }
    }
}
