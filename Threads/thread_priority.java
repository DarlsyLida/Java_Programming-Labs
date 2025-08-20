/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author fymsc49
 */

class thread11 extends Thread{
    public void run(){
        System.out.println("Thread priority");
    }
}

public class thread_priority {
    public static void main(String[] args){
        thread11 t1 = new thread11();
        thread11 t2 = new thread11();
        thread11 t3 = new thread11();
        
        System.out.println("Defaullt for t1 = "+t1.getPriority());
        System.out.println("Defaullt for t2 = "+t2.getPriority());
        System.out.println("Defaullt for t3 = "+t3.getPriority());
        
        t1.setPriority(3);
        t2.setPriority(7);
        t3.setPriority(10);
        
        System.out.println("Now Status for t1 = "+t1.getPriority());
        System.out.println("Now Status for t2 = "+t2.getPriority());
        System.out.println("Now Status for t3 = "+t3.getPriority());
        
        System.out.println("Thread name = "+Thread.currentThread().getName());
        System.out.println("Current thread default prioritye = "+Thread.currentThread().getPriority());
        
    }
}
