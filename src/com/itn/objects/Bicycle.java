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
public class Bicycle {
    static int count;
    int sn;
    String brand;
    double price;
    
    public Bicycle(){
        sn = count++;
        
    }
    public void showBicycle(){
        System.out.println("Sn: "+sn);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Total Production: "+Bicycle.count);
    }
    public static void displayBicycle(Bicycle b){
        //this meethods works only for class to display its objects 
        //so inorder to display it should be provided with what it should display
        System.out.println("Sn: "+b.sn+"Title: "+b.brand + "Price: "+b.price); 
        //if it was a non-static method we could use it like below
      //  System.out.println("Sn: "+sn+"Title: "+brand + "Price: "+price);
    }
    public static void main(String[] args) {
         Bicycle b1 = new Bicycle();
        b1.brand="Hero";
        b1.price = 1200;
        
        Bicycle b2 = new Bicycle();
        b2.brand = "pheonix";
        b2.price = 1300;
        
        //using non-static methods
        b1.showBicycle();
        b2.showBicycle();
        
        displayBicycle(b1);
        displayBicycle(b2);
        
    }
}
