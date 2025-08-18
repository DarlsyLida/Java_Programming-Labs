/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */


abstract class EmployeeA{
    String name;
    int id;
    
    EmployeeA(String name, int id){
        this.name=name;
        this.id = id;
    }
    
    abstract void display();
}

class Head extends EmployeeA{
    String department;
    
    Head(String name, int id, String department){
        super(name, id);
        this.department = department;
    }
    
    @Override
    void display(){
        System.out.println("HoD Name:"+name);
        System.out.println("HoD ID:"+id);
        System.out.println("Department:"+department);
    }
    
    
}
public class Exercise10 {
    public static void main(String[] args){
        Head h = new Head("Darlsy", 1, "IT");
        h.display();
    }
}
