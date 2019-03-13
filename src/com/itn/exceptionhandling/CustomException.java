/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.exceptionhandling;

/**
 *
 * @author rock and roll
 */
public class CustomException {
    
    static    int fund=900;
    
    public static void withdrawl(int amount)throws Exception{
        if(fund>amount){
            fund-=amount;
            System.out.println("Withdrawl Successful!");
        }
        else{
            throw new InsufficientFundException("Fund is not sufficient for withdrawl!");
        }
    }
    public static void main(String[] args) {
        int amount=1000;
        try{
            withdrawl(amount);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
