/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */



class Employee{
    //attributes
    int EmpId;
    String EmpName;
    String Department;
    double Salary;

    // Constructor

    public Employee(int EmpId, String EmpName, String Department, double Salary){
    this.EmpId=EmpId;
    this.EmpName = EmpName;
    this.Department=Department;
    this.Salary=Salary;
}

    public void display(){
        System.out.println("Employee ID: "+EmpId+" Name: "+EmpName+" from the Department of "+Department+" earns salary of "+Salary);

    }

}



public class Unit2OOP {
    
    public static void main(String[] args) {
        //createe the object
        int Id = 291056;
        String Name = "xyz";
        String Dep = "Sales";
        double Salary = 525000;
        Employee e = new Employee(Id, Name, Dep, Salary);
        e.display();
        
        
        
    }
}
