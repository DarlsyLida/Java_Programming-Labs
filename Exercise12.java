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
public class Exercise12 {
    public static void main(String[] args){
        
      Scanner input = new Scanner(System.in);  
    
        String[] names = new String[5];
        for (int i =0; i<5; i++){
            int x = i+1;
            System.out.println("Enter name of Student "+ x);
            names[i]= input.next();
            
    }
        System.out.print("Student Names are: ");
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
