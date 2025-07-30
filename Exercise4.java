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
public class Exercise4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to check if Even or Odd:");
        int no = scanner.nextInt();
        if (no % 2 == 0){
            System.out.println(no+" is Even.");
        }
        else
            System.out.println(no+" is Odd.");
            
    }
    
}
