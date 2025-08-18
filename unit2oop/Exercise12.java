/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */
public class Exercise12 {
    String cid,cname,description;
    Exercise12(String cid,String cname,String description){
        this.cid = cid;
        this.cname=cname;
        this.description = description;
        
    }
    
    void print_details(){
        System.out.println("Course ID: " + this.cid);
        System.out.println("Course Name: " + this.cname);
        System.out.println("Description: " + this.description);
    }
    
    public static void main (String[] args){
        Exercise12 course = new Exercise12("3", "Java Programming", "This course is 90% Practical. Students are enjoying.");
        course.print_details();
    }
}
