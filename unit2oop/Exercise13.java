/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */

public class Exercise13 {
    // private fields for encapsulation
    private String cid;
    private String cname;
    private String description;

    // Constructor to initialize the fields
    public Exercise13(String cid, String cname, String description) {
        this.cid = cid;
        this.cname = cname;
        this.description = description;
    }

    // Getters and setters for each field
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to print course details
    public void printDetails() {
        System.out.println("Course ID: " + getCid());
        System.out.println("Course Name: " + getCname());
        System.out.println("Description: " + getDescription());
    }

    public static void main(String[] args) {
        Exercise13 course = new Exercise13("3", "Java Programming", "This course is 90% Practical. Students are enjoying.");
        course.printDetails();
    }
}
