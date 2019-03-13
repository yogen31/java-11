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
public class Pen {
    String name;
    String type;
    double price;
    
    public Pen(){
        //default constructor
    }
    public Pen(String type,double price){
        this.type = type;
        this.price = price;
    }
    
    
    public Pen(String name,String type, double price){
        this.name = name;
        this.type = type;
        this.price = price;
        //parameterized constructor
    }

    //  public Pen(String type,String name, double price){// not allowed since it matches the type of the upper public Pen
      //  this.name = name;
        //this.type = type;
        //this.price = price;
        //parameterized constructor
    //}
    
    @Override
    public String toString() {
        return "Pen{" + "name=" + name + ", type=" + type + ", price=" + price + '}';
    }
    
    
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.name = "Pilot pen";
        p1.type = "Ink Pen";
        p1.price = 50;
       
        Pen p2 = new Pen("Starline","Gel Pen",100);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        Pen p3 = new Pen("k ho",80);
        System.out.println(p3.toString());        
    }
    
    
}
