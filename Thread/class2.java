/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread;

/**
 *
 * @author fymsc49
 */

class thread2 implements Runnable{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

public class class2 {
    public static void main(String[] args){
        thread2 t1 = new thread2();
        Thread T = new Thread(t1, "Darl");
        T.start();
        System.out.println("Thread Name "+ T.getName());
    }
}
