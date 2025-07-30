/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author fymsc49
 */
public class Exercise13 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Interger: ");
        int n = input.nextInt();
        
        System.out.print("Enter Float: ");
        
        float f = input.nextFloat();
        
        System.out.print("Typecasting output: ");
         double n1 = n;
         
         int f1 = (int) f;
         
         DecimalFormat df = new DecimalFormat("0.00");
         System.out.println(df.format(n1));
         System.out.println(f1);
         
        
        
    }
    
}
