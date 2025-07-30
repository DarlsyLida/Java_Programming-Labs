/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;
import java.util.Scanner;
/**
 *
 * @author fymsc49
 */
public class Exercise9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to generate its Factorial: ");
        int no = scanner.nextInt();
        int fact = 1;
        for (int i =1; i<=no; i++){
            fact*=i;
            
        }
        System.out.print("Factorial of  "+no+ " is "+fact);
        
            
    }
    
}
