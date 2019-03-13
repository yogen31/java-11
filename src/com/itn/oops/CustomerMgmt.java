/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class CustomerMgmt {

    public void fillCustomerDetail(Customer c) {
        //method takes a default constructor of customer class
        //add customer detail information in the object's fields
        //then return that object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer information: ");
        System.out.println("Enter Customer id:");
        int id = sc.nextInt();
//  c.id=id; //private field id not accessible from outside of class
        c.setId(id);
        System.out.println("Enter  customer gender");
        char gender = sc.next().charAt(0);
        c.setGender(gender);
        
        sc.nextLine();//dummy input

        System.out.println("Enter name:");
        c.setName(sc.nextLine());

        System.out.println("Enter address:");
        c.setAddress(sc.nextLine());
        
        System.out.println("Enter date of birth(yyyy-mm-dd):");
        String date=sc.nextLine();//input date as a string and convert it into date
        c.setDob(LocalDate.parse(date));
        
        
        

    }
    public void showCustomer(Customer c){
        System.out.println("Customer detail:");
//        System.out.println("Id:"+c.id);
        System.out.println("Id: "+c.getId());
        System.out.println("Name: "+c.getName());
        System.out.println("Address: "+c.getAddressi());
        System.out.println("Gender: "+c.getGender());
        System.out.println("Date of birth: "+c.getDob().getMonth()+" "+c.getDob().getDayOfMonth()+", "+c.getDob().getYear());
        
    }
    public static void main(String[] args) {
        System.out.println("Welcome to customer management app");
        Customer c1 = new Customer();
        
        CustomerMgmt cm = new CustomerMgmt();
        cm.fillCustomerDetail(c1);
        cm.showCustomer(c1);
        
        Customer [] customers = new Customer [2];
        //array of 10 customer objects
        for(int i=0;i<2;i++){
            customers[i]=new Customer();
            cm.fillCustomerDetail(customers[i]);
            
            
        }
        for(Customer cust:customers){

//            cm.showCustomer(cust);
            System.out.println(cust.toString());
            
        }
        
    }
}
