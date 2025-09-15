/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

/**
 *
 * @author fymsc49
 */
import java.util.*;
public class stack {
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Geeta");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        
        stack.pop();
        
        Iterator<String> itr = stack.iterator();
        
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
