/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;
import java.util.Scanner;

// Wrapper class to hold two numbers
class Numbers {
    int a;
    int b;
}

public class Exercise17 {

    // User Defined Function to swap values
    public static void swap(Numbers nums) {
        int temp = nums.a;
        nums.a = nums.b;
        nums.b = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers nums = new Numbers();

        // Input two numbers
        System.out.print("Enter first number: ");
        nums.a = scanner.nextInt();
        System.out.print("Enter second number: ");
        nums.b = scanner.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("a = " + nums.a + ", b = " + nums.b);

        // Call the swap function
        swap(nums);

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + nums.a + ", b = " + nums.b);

        scanner.close();
    }
}
