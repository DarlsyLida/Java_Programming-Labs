/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */
// Interface for Rectangle
interface RectangleInt {
    double getRectangleArea(double length, double width);
}

// Interface for Circle
interface CircleInt {
    double getCircleArea(double radius);
}

// Class that implements both interfaces (achieving multiple inheritance)
class AreaCalculatorInt implements RectangleInt, CircleInt {

    @Override
    public double getRectangleArea(double length, double width) {
        return length * width;
    }

    @Override
    public double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Main class to test the logic
public class Exercise14 {
    public static void main(String[] args) {
        AreaCalculatorInt calculator = new AreaCalculatorInt();

        double length = 5;
        double width = 3;
        double radius = 4;

        double rectangleArea = calculator.getRectangleArea(length, width);
        double circleArea = calculator.getCircleArea(radius);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
