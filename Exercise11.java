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
public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int no = input.nextInt();
        
        int sum =0;
         while (no != 0){
             int d = no%10;
             sum += d;
             no /=10;
         }
         System.out.print("Sum of the Digits is "+ sum);
        
    }
    
}
