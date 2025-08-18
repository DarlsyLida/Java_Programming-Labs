//
//package com.mycompany.unit2oop;
//
///**
// *
// * @author fymsc49
// */
//// Interface for addition
//interface AdditionA {
//    int add(int a, int b);
//}
//
//// Interface for subtraction
//interface SubtractionA {
//    int subtract(int a, int b);
//}
//
//// Calculator interface inherits both Addition and Subtraction interfaces
//interface Calculator2 extends AdditionA, SubtractionA {
// 
//}
//
//// Implementing the Calculator interface
//class CalculatorImp2 implements Calculator2 {
//    @Override
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    @Override
//    public int subtract(int a, int b) {
//        return a - b;
//    }
//}
//
//// Main class to test the calculator
//public class Exercise8 {
//    public static void main(String[] args) {
//        Calculator2 calc = new CalculatorImp2();
//
//        int num1 = 20;
//        int num2 = 10;
//
//        System.out.println("Addition of " + num1 + " and " + num2 + " = " + calc.add(num1, num2));
//        System.out.println("Subtraction of " + num1 + " and " + num2 + " = " + calc.subtract(num1, num2));
//    }
//}
