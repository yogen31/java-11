/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.objects;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class Book implements Cloneable {
    
    //instance variables
    int sn;
    String title;
    String author;
    String publisher;
    double price;
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    //behaviours 
    public void  showBook(){
        //non-static variables are directly accessible from within non-static method
        
        System.out.println("Book S.no: "+sn);
        System.out.println("Book Title: "+title);
        System.out.println("Book Author: "+author);
        System.out.println("Book Publisher: "+publisher);
        System.out.println("Book Price: "+price);
    }
    public void createBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        title = sc.nextLine();
        System.out.println("Enter Book Author: ");
        author = sc.nextLine();
        System.out.println("Enter Book Publisher: ");
        publisher = sc.nextLine();
        System.out.println("Enter Book Price: ");
        price = sc.nextDouble();
        System.out.println("Enter Book Serial Number: ");
        sn = sc.nextInt();
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        //instanciating book object using default constructor
        //Default constructor is provided by JVM if we donot create it ourselves
        b1.createBook();
        
        Book b2 = new Book();
        
        b2.createBook();
        
        Book b3 = b2;
        b2.sn = 100000;
        
        b1.showBook();
        b2.showBook();
        b3.showBook();
    }
    
}
