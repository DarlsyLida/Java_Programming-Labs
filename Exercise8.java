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
public class Exercise8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int no1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int no2 = scanner.nextInt();
        int var = no1;
        no1=no2;
        no2 = var;
        System.out.println("After Swapping First="+no1+" Second="+no2);
        
        
            
    }
    
}
