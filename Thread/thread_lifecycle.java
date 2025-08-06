/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread;

/**
 *
 * @author fymsc49
 */
public class thread_lifecycle {
    public static void main(String [] args){
        
        A threadA = new A();
        B threadB = new B();
        
        
        threadA.start();
        
        // Move control to another thread
        threadA.yield();
        
        
        // blocked state of thread B
        try
        {
            threadA.sleep(millis:1000);
        }
        
        catch (InterruptedException e){
            e.printStackTrace();
        }
        
        threadB.start();
        System.out.println(x:"Main Thread End");
        
        
        
    }
    
}
class A extends Thread{
    public void run(){
        System.out.println(x:"Thread A");
        System.out.println(x:"i in Thread A");
        for (int i =1; i<=5; i++){
            System.out.println("i= "+i);
            try{
                Thread.sleep(millis:1000);
            }
            catch(InterruptedExceptin e){
                e.printStackTrace();
            }
            
        }
        System.out.println(x:"Thread A Completed");
    }
}

class B extends Thread{
    public void run(){
        System.out.println(x:"Thread B");
        System.out.println(x:"i in Thread B");
        for (int i =1; i<=5; i++){
            System.out.println("i= "+i);
            
            
        }
        System.out.println(x:"Thread B Completed");
    }
}

