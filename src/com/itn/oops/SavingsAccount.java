/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

/**
 *
 * @author rock and roll
 */
public class SavingsAccount extends Account{

   

        public double interest;
        public String type;

        public double minBalance;
        public double withdrawlLimit;
        
        public void openSavingsAccount(){
            //create an bank account
            createAccount();//method inherited from  Account class
            //add details related to SavingsAccount
            interest = 4.00;
            type = "Daily Savings";
            minBalance = 1000;
            withdrawlLimit = 10000;
            
        }
        //since we applied withdrawl related policies we have to override 
        //withdrawl methds that suits our savings account
        
        @Override
        public void withdrawl(double amount){
            if(amount>withdrawlLimit && this.amount -amount<1000){
                System.out.println("Withdrawl not possible");
            }else{
                this.amount -= amount;
                System.out.println("Amount withdrawn: "+amount);
                System.out.println("New amount: "+this.amount);
            }
            
        }

    }


