/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rock and roll
 */
public class BufferedDemo {
    public static void main(String[] args) {
        FileReader fr = null;
       BufferedReader br = null;
       
       FileWriter fw = null;
       BufferedWriter bw = null;
        try{
            fr = new FileReader("c:/Users/rock and roll/Desktop/src.txt");
            fw = new FileWriter("c:/Users/rock and roll/Desktop/dest.txt");
            
            br = new BufferedReader(fr);
            bw=new BufferedWriter(fw);
            //buffered read and buffered writing
            String line ="";
            int count = 0;
            while((line=br.readLine()) != null){
                bw.write(++count+": "+line);
                bw.newLine();
                
                System.out.println(count +": "+line);
            }
        }catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
        catch(IOException ie){
            System.out.println(ie);
            
        }
        finally{
            try{
                if(br!=null){
                    br.close();
                }
                if(bw!=null){
                    bw.close();
                }
                 if(fr!=null){
                    fr.close();
                }
                if(fw!=null){
                    fw.close();
                
            }
            
        }catch(IOException ie){
            System.out.println(ie);
        }
        
       
    }
}
}
