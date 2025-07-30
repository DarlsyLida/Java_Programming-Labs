package com.mycompany.lab2;
import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String to check if Palindrome: ");

        String input = s.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check for palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        s.close();
   
    
    }
}