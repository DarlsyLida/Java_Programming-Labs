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
public class Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int first = scanner.nextInt();
        System.out.print("Enter Second Value: ");
        int second = scanner.nextInt();
        System.out.print("Enter Third Value: ");
        int third = scanner.nextInt();
        int max;
        
        
        if (first >= second && first>=third){
            max=first;
        }
        else if (second >= first && second >= third){
            max = second;
        }
        else
            max=third;
        
        System.out.println("Maximum value is "+max);
    }
    
    
    
    
}
