/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author fymsc49
 */
public class Exercise14 {
    public static void main(String[] args){
        
        System.out.print("Exercise A");
        
        for (int i =0; i<5; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
        
        System.out.print("Exercise B");
        for (int i =0; i<5; i++){
            for (int j = 0; j<i; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        
        
        System.out.print("Exercise C");
        for (int i =0; i<5; i++){
            for (int j = 0; j<i; j++){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
        
        
        
        System.out.print("Exercise D");
        System.out.println();
        char last = 'E', alphabet = 'A';

        for (int i = 1; i <= (last - 'A' + 1); ++i) {
          for (int j = 1; j <= i; ++j) {
            System.out.print(alphabet + " ");
          }
          ++alphabet;

          System.out.println();
        }
        
        
        for (int i = 1; i <= (last - 'A' + 1); ++i) {
          for (int j = 1; j <= i; ++j) {
            System.out.print(alphabet + " ");
          }
          ++alphabet;

          System.out.println();
        }
    }
    
}
