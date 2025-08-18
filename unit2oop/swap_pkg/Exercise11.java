/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swap_pkg;

/**
 *
 * @author fymsc49
 */
// File: SwapNumbers.java


import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swapping logic using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        scanner.close();
    }
}
