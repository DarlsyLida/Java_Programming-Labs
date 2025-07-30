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
public class Exercise10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number to Reverse: ");
        int no = input.nextInt();
        int reversedNumber = 0;
        
        while (no != 0)
        {
            int rem = no % 10;
            reversedNumber = reversedNumber * 10 + rem;
            
             no /= 10;
        }
        
        System.out.print("Reverse number of input is "+reversedNumber);
        
    }
}
