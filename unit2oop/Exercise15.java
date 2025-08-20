/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */
// Course class demonstrating constructor overloading
class CourseO {
    int cid;
    String cname;
    String description;

    // Constructor 1: Only Course ID
    CourseO(int cid) {
        this.cid = cid;
        this.cname = "Not specified";
        this.description = "Not specified";
    }

    // Constructor 2: Course ID and Course Name
    CourseO(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
        this.description = "Not specified";
    }

    // Constructor 3: Course ID, Course Name, and Description
    CourseO(int cid, String cname, String description) {
        this.cid = cid;
        this.cname = cname;
        this.description = description;
    }

    // Method to display course details
    void display() {
        System.out.println("Course ID: " + cid);
        System.out.println("Course Name: " + cname);
        System.out.println("Description: " + description);
        System.out.println("--------------------------------");
    }
}

// Main class to test Course constructors
public class Exercise15 {
    public static void main(String[] args) {
        // Using constructor with only CID
        CourseO course1 = new CourseO(101);
        course1.display();

        // Using constructor with CID and CName
        CourseO course2 = new CourseO(102, "Java Programming");
        course2.display();

        // Using constructor with all details
        CourseO course3 = new CourseO(103, "Data Structures", "Covers stacks, queues, trees, and graphs.");
        course3.display();
    }
}

