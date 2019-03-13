/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class Account {
    public int accNo;
    public String name;
    public String branch;
    public double amount;
    
    public static final String BANK = "ABC Development Bank";
    public static int count = 10001;
    
    public Account(){
        accNo = count++;
    }
    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account name: ");
        name = sc.nextLine();
        System.out.println("Enter branch: ");
        branch = sc.nextLine();
        System.out.println("Enter deposit amount: ");
        amount = sc.nextDouble();
    }
    public void viewAccount(){
        System.out.println("**********************");
        System.out.println(BANK);
        System.out.println("Branch: "+branch);
        System.out.println("Account_No: "+accNo);
        System.out.println("Acc_Name: "+name);
        System.out.println("Account_amount: "+amount);
        System.out.println("***********************");
        
    }
    public void deposit(double amount){
        this.amount += amount;
        System.out.println("Amount deposited: "+amount);
        System.out.println("New Amount: "+this.amount);
    }
    public void withdrawl(double amount){
        this.amount -= amount;
        System.out.println("Withdrawl Amount: "+amount);
        System.out.println("New Amount: "+this.amount);
    }
}
