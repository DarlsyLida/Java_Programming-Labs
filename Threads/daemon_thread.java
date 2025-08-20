/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author fymsc49
 */
public class daemon_thread extends Thread {
    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work");
        } else{
            System.out.println("User thread work");
        }
    }
    
    
    public static void main(String[] args){
        daemon_thread t1 = new daemon_thread(); //creating thread
        daemon_thread t2 = new daemon_thread();
        daemon_thread t3 = new daemon_thread();
        
        
        t1.setDaemon(true); // now t1 is daemon thread
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
