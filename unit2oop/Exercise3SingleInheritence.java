/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */


class Calculator{
    protected int a,b;
    
    public Calculator(int a,int b)
    {
       this.a = a;
       this.b =b;
       
       
    }
    
    
    public double add(){
        return a+b;
    }
    
    
    
    public double subtract(){
        return a-b;
    }
}


class Calculator2 extends Calculator{
    
    public Calculator2(int a, int b){
        super(a,b);
    }
    
    public double multiply(){
        return a*b;
    }
    
    
    
    public double division(){
        return a/b;
    }
}

public class Exercise3SingleInheritence {
    public static void main (String[] args){
        Calculator2 c = new Calculator2(4, 5);
        System.out.println("Addition: " +c.add());
        System.out.println("Subtraction: " +c.subtract());
        System.out.println("Multiplication: "+c.multiply());
        System.out.println("Division: "+c.division());
        
        
    }
}


