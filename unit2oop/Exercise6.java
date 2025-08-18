/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */
class Employee1 {
    int empId;
    String empName;
    double salary;

    // Constructor using 'this' keyword
    Employee1(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Method to display employee details using 'this'
    void display() {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }

    
}

public class Exercise6{
    public static void main(String[] args) {
        // Create employee objects
        Employee1 emp1 = new Employee1(10, "Darlsy", 50000);
        Employee1 emp2 = new Employee1(20, "Otieno", 60000);

        // Display employee details
        emp1.display();
        emp2.display();
    }
}

