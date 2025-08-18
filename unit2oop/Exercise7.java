/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */
// Interface for addition
interface Addition {
    int add(int a, int b);
}

// Interface for subtraction
interface Subtraction {
    int subtract(int a, int b);
}

// Calculator interface inherits both Addition and Subtraction interfaces
interface Calculator1 extends Addition, Subtraction {
 
}

// Implementing the Calculator interface
class CalculatorImpl implements Calculator1 {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

// Main class to test the calculator
public class Exercise7 {
    public static void main(String[] args) {
        Calculator1 calc = new CalculatorImpl();

        int num1 = 20;
        int num2 = 10;

        System.out.println("Addition of " + num1 + " and " + num2 + " = " + calc.add(num1, num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + " = " + calc.subtract(num1, num2));
    }
}
