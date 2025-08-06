/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */

class Student{
    int rollno;
    String name;
    
    public Student(){
        this.rollno=00;
        this.name="Default Name";
        
    }
    
    public Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
        
    }
    
    public void display(){
        System.out.println("Roll Number "+rollno);
        System.out.println("Student Name: "+name);
    }
}
public class Exercise2 {
    
    
    
    public static void main (String[] args){
        
        // default 
        Student s1 = new Student();
        s1.display();
        
        Student s2 = new Student(49, "Darlsy");
        s2.display();
        
        
    }
    
}

