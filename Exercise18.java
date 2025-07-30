
package com.mycompany.lab2;
import java.util.Scanner;

public class Exercise18 {

    // User Defined Function to check even or odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN.");
        } else {
            System.out.println(number + " is ODD.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Call the UDF
        checkEvenOdd(num);

        scanner.close();
    }
}
