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
public class AbcBank {
    public static void main(String[] args) {
        SavingsAccount ac1 = new SavingsAccount();
        ac1.openSavingsAccount();
        //fill account details
        ac1.deposit(10000);
        
        ac1.viewAccount();
        //show account details
        
        SavingsAccount ac2 = new SavingsAccount();
        ac2.createAccount();
        ac2.deposit(5000);
        
        Account ac3 = new SavingsAccount();
        ac3.createAccount();
        ac3.deposit(1000);
        
        Account ac4 = new Account();
        ac4.deposit(1200);
        
        ac1.withdrawl(8000);
        
        ac2.withdrawl(12000);
        ac3.withdrawl(500);// this calls overriden method in child class
        ac4.withdrawl(15000);//calls method in parent class
        // both are references of account class(ac3 & ac4)
        //when they are         //but they decide which method to call only ar run time assigned an object
        //if they are assigned child object they call overriden method of 
        //child claas or else they will call parent class method 
    }
    
}
