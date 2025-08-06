/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread;

/**
 *
 * @author fymsc49
 */
class A implements Runnable{
    public void run(){
        System.out.println("Thread A is running");
    }
}

class B implements Runnable{
    public void run(){
        System.out.println("Thread B is running");
    }
}
public class thread_lifecycle {
    public static void main(String [] args){
        
        A threadA = new A();
        B threadB = new B();
        
        
        threadA.start();
        
        // Move control to another thread
        threadA.yield();
        
        
        // blocked state of thread B
        try{
            threadA.sleep(millis:1000);
        }
        
        catch (InterruptedException e){
            e.printStackTrace();
        }
        
        
        
    }
    
}
