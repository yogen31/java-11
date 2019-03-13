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
public class CourseBoook extends Book{
    public String grade;
    public String board;
    public String type;
    
   public CourseBoook(){
       //there is an implicit call to superclass constructor from subclass
       //class constructor even if we do not mention it
       super();
       //call to a superclass constructor should be a first line inside sub class constructor
       
   }
   
   public CourseBoook(String grade,String board,String type){
       super();
       this.grade = grade;
       this.board = board;
       this.type = type;
       
   }
   public CourseBoook(String title, String author, String publication , double price,String grade, String board, String type){
       super(title,author,publication,price);
       this.grade = grade;
       this.board = board;
       this.type = type;
       
   }
   public void showCourseBook(){
      displayBook();
      //this method is made available through inheritance
       System.out.println("Course Book detail");
       System.out.println("*******************************");
       System.out.println("Grade: "+grade);
       System.out.println("Board: "+board);
       System.out.println("Type: "+type);
       System.out.println("*******************************");
      
   }
   public void createCourseBook(){
       publishBook();
       this.grade = "BBA";
       this.board = "TU";
       this.type = "Reference TextBook";
       
   }
    public static void main(String[] args) {
        CourseBoook b1 = new CourseBoook();
        b1.createCourseBook();
        b1.showCourseBook();
        
        Book b2 = new CourseBoook();
        b2.publishBook();
        b2.displayBook();
        //access to book specific features only
        //COurseBook features are hidden
        
        Book b3 = new Book();
        //not inheritance 
        //means CourseBook class run method has Book class object 
        
//        CourseBoook b4 = new Book();
        //Book is not a type of CourseBook
        //while CourseBook is of type Book
        //so syntatically incorrect
        
        CourseBoook b5 = new CourseBoook("Java Fundamentals","Gopal Sharma","Sajha",700,"BSC IT","TU","Programming");
        b5.showCourseBook();
        
    }
}
