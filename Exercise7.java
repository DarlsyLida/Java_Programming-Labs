package com.mycompany.lab2;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Flag to indicate even status
        boolean isEven = false;

        // Check if number is even
        if (number % 2 == 0) {
            isEven = true;
        }

        // Use the flag to print result
        if (isEven) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is NOT EVEN.");
        }

        scanner.close();
    }
}
