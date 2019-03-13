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
public class AbstractTest extends AbstractDemo {

    public String desc;

    public AbstractTest(String key, int value, String desc) {
        super(key, value);
        this.desc = desc;
    }

    @Override
    public void get() {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
        System.out.println("Description: " + desc);
    }

    public static void main(String[] args) {
        AbstractDemo at = new AbstractTest("Score", 64, "Score of first team");
        System.out.println(at.key);
        System.out.println(at.value);
        at.get();

        AbstractDemo ad = new AbstractTest("Score", 43, "Score of Second team");
        System.out.println(ad.key);
        System.out.println(ad.value);
        ad.get();
        //abstraction test
        //abstract class doesnot allow to create its object
        //but it is allowed to participate in inheritance so its 
        //functionality can be re used by its sub-classes
//             AbstractDemo add = new AbstractDemo("Score",55);
//             Abstract class is inherited and the child class object is created to
//            use the functionality provided by parent class
        AbstractDemo add = new AbstractTest("Score", 55, "Score of visiting team");
        System.out.println(add.key);
        System.out.println(add.value);
        add.get();
    }

    @Override
    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key:");
        key = sc.nextLine();
        System.out.println("Enter value:");
        value = sc.nextInt();

    }

}
