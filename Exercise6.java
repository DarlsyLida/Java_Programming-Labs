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
public class Exercise6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to create fibonancie series:");
        int no = scanner.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i<=no; i++){
            System.out.print(a+"  ");
            int next = a+b;
            a=b;
            b= next;
        }
    }
    
}
