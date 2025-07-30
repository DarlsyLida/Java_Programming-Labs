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
public class Exercise5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to check the Prime:");
        int no = scanner.nextInt();
        boolean checkPrime=true;
        if (no <= 1){
            System.out.println(no+" is Not Prime.");
            
        }
        else {
            for (int i = 2; i <= Math.sqrt(no); i++) {
                if (no % i == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime){
                System.out.println(no+" is Prime.");
            }
            else
                System.out.println(no+" is Not Prime.");
        }
    }
    
}
