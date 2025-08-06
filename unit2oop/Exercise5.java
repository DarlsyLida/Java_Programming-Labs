/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit2oop;

/**
 *
 * @author fymsc49
 */


// Parent class
class Shape {
    // You can add common properties or methods here if needed
}

// Child class for Rectangle
class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }
}

// Child class for Cube
class Cube extends Shape {
    int side;

    Cube(int side) {
        this.side = side;
    }

    int surfaceArea() {
        return 6 * side * side;
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(45, 23);
        Cube cube = new Cube(50);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Surface Area of Cube: " + cube.surfaceArea());
    }
}

