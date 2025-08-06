/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread;

/**
 *
 * @author fymsc49
 */
class thread1 extends Thread {
    public void run(){
        System.out.println("Thread is running");
        for(int i=1; i<11; i++){
            System.out.println(i);
        }
    }
    
}

public class class1{
    public static void main(String[] args){
        thread1 t = new thread1();
        t.start();
        
    }
}