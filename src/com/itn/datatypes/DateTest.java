/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.datatypes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author rock and roll
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        
        String today="2019-03-06";
        LocalDate entryDate = LocalDate.parse(today);
        System.out.println("Day: "+entryDate.getDayOfMonth());
        System.out.println("Month: "+entryDate.getMonth());
        System.out.println("Year: "+entryDate.getYear());
        
        
        
    }
    
}
