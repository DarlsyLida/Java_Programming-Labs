/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */

class College {
    String collegename;
    
    
    public College(String collegename){
        this.collegename=collegename;
    }
    
    public void displayCollege(){
        System.out.println("College Name: "+collegename);
    }
}



class Course extends College{
    
    String course;
    
    public Course(String collegename, String course){
        super(collegename);
        this.course=course;
    
    
}

    public void displayCourse(){
        System.out.println("Course Name: "+course);
    }
}


class Subject extends Course{
    
    String subject;
    
    public Subject(String collegename, String course, String subject){
        super(collegename, course);
        this.subject=subject;
    
}
    public void displaySubject(){
        System.out.println("Subject Name: "+subject);
    }
    
    public void displayAll(){
        displayCollege();
        displayCourse();
        displaySubject();
    }
    
}




public class Exercise4 {
    
    public static void main(String[] args){
        Subject s = new Subject("MSU", "IT", "Core Java");
        s.displayAll();
    }
    
}
